package Recursion;

public class SkipaFromString {
    public static void main(String[] args) {
        String str = "baccad";
        String ans = "";
        System.out.println(removea(str, ans));
    }
    static String removea(String str , String ans ){
        if(str.isEmpty()){
            return ans;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return removea(str.substring(1) , ans );
        }
        else{
            return removea(str.substring(1) , ans+ch);
        }
    }
}
