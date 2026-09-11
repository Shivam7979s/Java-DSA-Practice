package StringsandStringBuilder;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "tar";
        System.out.println(isAnagram(s1, s2));
    }
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }
}
