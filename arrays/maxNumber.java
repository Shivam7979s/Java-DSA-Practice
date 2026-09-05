package arrays;

public class maxNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,89,7,88};
        
        System.out.println(Max(arr));

    }
    static int Max(int[] arr){
        
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        return max;
        
    }
    
}
