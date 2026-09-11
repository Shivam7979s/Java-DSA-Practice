package StringsandStringBuilder;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = " helloh Hello    ";
        System.out.println(lengthOfLastWord(str));
    }
    static int lengthOfLastWord(String str) {
        int n  = str.length();
        int count = 0;
        boolean flag = false;
        String name = new String();
        for (int i = 0; i <n; i++) {
            if (str.charAt(i) != ' ') {
                if (!flag) {
                    flag = true;
                    count=1;
                }
                else {
                    count++;
                }

            }
            else {
                flag = false;
            }
        }
        System.out.println(name);
        return count;
    }
}
