package StringsandStringBuilder;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String str = "abbaca";
        String ans = "";
        System.out.println(removea(str , ans ));

    }
    static String removea(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
        char a =  str.charAt(0);
        char b =  str.charAt(1);;
        if(a == b){
            return removea(str.substring(1), ans);
        }
        else{
            return removea(str.substring(1), ans+a);
        }

    }
}
