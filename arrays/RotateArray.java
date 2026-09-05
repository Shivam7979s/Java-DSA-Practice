package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
     static void rotate(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        int start=0;
        int end=n-1;

        reverse(nums, start, end);
        reverse(nums, start, k-1);
        reverse(nums, k, end);
    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
             int temp=nums[start];
             nums[start]=nums[end];
             nums[end]=temp;

             start++;
             end--;
         }


    }
    
}
