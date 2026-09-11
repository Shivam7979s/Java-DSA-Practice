package StringsandStringBuilder;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str) );

    }
    static boolean isValid(String s) {
        int n = s.length();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                a++;
            }
            if (s.charAt(i) == ')' && a > 0) {
                a--;
            }
            if (s.charAt(i) == '{') {
                b++;
            }
            if (s.charAt(i) == '}') {
                b--;
            }// incomplete because it needed stack
            if (s.charAt(i) == '[') {
                c++;
            }
            if (s.charAt(i) == ']') {
                c--;
            }
        }
        return a == 0 && b == 0 && c == 0;
    }
}
