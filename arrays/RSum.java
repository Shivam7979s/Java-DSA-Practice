package arrays;

import java.util.Arrays;

public class RSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
       
        int[] rsum= new int[arr.length];

        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
            rsum[i]=count;
        }
        System.out.println(Arrays.toString(rsum));
    }
    
}