package StringsandStringBuilder;

public class BasicCalculator {

    public static void main(String[] args) {

        String s = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(calculate(s));
    }

    static int calculate(String s) {

        int ans = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Skip spaces
            if (c == ' ') {
                continue;
            }

            // Number
            if (Character.isDigit(c)) {

                int num = 0;

                while (i < s.length() &&
                        Character.isDigit(s.charAt(i))) {

                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i--;

                if (op == '+') {
                    ans += num;
                } else {
                    ans -= num;
                }

                continue;
            }

            // Opening parenthesis
            if (c == '(') {

                int start = i + 1;
                int depth = 1;

                i++;

                while (i < s.length() && depth > 0) {

                    if (s.charAt(i) == '(') {
                        depth++;
                    } else if (s.charAt(i) == ')') {
                        depth--;
                    }

                    i++;
                }

                String inside = s.substring(start, i - 1);

                int value = calculate(inside);

                if (op == '+') {
                    ans += value;
                } else {
                    ans -= value;
                }

                i--;          // <-- add this: compensate for the for-loop's i++

                continue;
            }

            // Operators
            if (c == '+') {
                op = '+';
            }

            if (c == '-') {
                op = '-';
            }
        }

        return ans;
    }
}