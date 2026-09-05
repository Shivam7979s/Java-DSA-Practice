package arrays;
public class Linearsearch {
    public static void main(String[] args) {
        int[] arr={1,4,22,54,664,75,3,7,9};
        int target=78776;

        System.out.println(Linear(arr, target));
        
    }
    static boolean Linear(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;


    }
    
}
