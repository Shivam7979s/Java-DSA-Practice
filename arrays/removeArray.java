package arrays;

import java.util.Arrays;

public class removeArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,1,5,5,4,3,2};
       
        int val=2;
        int count=0;
         for(int i=0; i<nums.length;i++){
            if(val==nums[i]){
                count++;
            } 
        }
          int[] ans = new int[nums.length-count];
        for(int i=0;i<ans.length; i++){
            if(val!=nums[i]){
                 ans[i]=nums[i];
            
            }
           
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
