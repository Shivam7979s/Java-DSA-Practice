package StringsandStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] word ={"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(word)));


    }
    static String[] findWords(String[] word) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length; i++) {
            String[] a = word[i].toLowerCase().split("");
            boolean flag = true;
            String temp = "";

            if (first.contains(a[0])) {
                temp = first;
            }
            else if (second.contains(a[0])) {
                temp = second;
            }
            else {
                temp = third;
            }

            for (int j = 1; j < a.length; j++)
                if (!temp.contains(a[j])) {
                    flag = false;
                    break;
                }
            if (flag)
                list.add(word[i]);
        }
        String[] ans = list.toArray(new String[list.size()]);
        return ans;
    }
}
