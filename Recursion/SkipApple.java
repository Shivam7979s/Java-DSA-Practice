package Recursion;

public class SkipApple {
    public static void main(String[] args) {
        String str = "appapplele";
        String ans = "";
        System.out.println(skipapple(str, ans ));

    }
    static String skipapple(String str,String ans){
        if(str.isEmpty()){
            return ans;
        }

        if(str.startsWith("apple")){
            return skipapple(str.substring(5), ans);
        }
        else{
            return skipapple(str.substring(1), ans+str.charAt(0));
        }
    }
}
