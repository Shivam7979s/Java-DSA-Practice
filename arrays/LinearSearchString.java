package arrays;
public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Shivam";
        char target = 'k';

        System.out.println(SearchString(name,target));
        
    }

    static boolean SearchString(String name,int target){
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }

        }
        return false;

    }
    
}
