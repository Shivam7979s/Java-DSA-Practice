package Recursion;

public class SkipaFromString {
    public static void main(String[] args) {
        String str = "baccad";
        String ans = "";
        System.out.println(removea(str));
    }
    static String removea(String str ){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return removea(str.substring(1)  );
        }
        else {
            return ch + removea(str.substring(1) );
        }
    }
}
//........................................................................................................................//