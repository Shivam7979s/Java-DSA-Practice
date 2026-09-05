package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
    

    int[] arr={1,2,3,4,5,6};
    int[] ans=new int[arr.length*2];

    for(int i=0;i<arr.length;i++){
        ans[i]=arr[i];
    }
   
    for(int i=arr.length,j=0;i<ans.length;i++,j++){
        ans[i]=arr[j];
    }

    System.out.println(Arrays.toString(ans));

    }

    
}
