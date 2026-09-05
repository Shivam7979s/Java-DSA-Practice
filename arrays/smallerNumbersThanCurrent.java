package arrays;
import java.util.Arrays;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr={7,7,7,7};
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    ans[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
