package Recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
//       System.out.println(printSubSeq(str, ans));
        subSeq(str,ans);
    }
    // Store every Subseq in Arraylist then print it ;
    static ArrayList<String> printSubSeq(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String > left = printSubSeq(str.substring(1), ans+ch);
        ArrayList<String > right = printSubSeq(str.substring(1), ans);
        left.addAll(right);
        return left;
    }
    // without Arraylist only printing
    static void subSeq(String str , String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subSeq(str.substring(1), ans+ch);
        subSeq(str.substring(1), ans);
    }
}
