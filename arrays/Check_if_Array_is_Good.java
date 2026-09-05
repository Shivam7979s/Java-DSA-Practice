package arrays;

import java.util.Arrays;

public class Check_if_Array_is_Good {
    public static void main(String[] args) {
        int[] nums={1, 3,1, 3, 2};
        System.out.println(isGood(nums));

    }
    static boolean isGood(int[] nums){
        int n=nums.length;
        int base=n-1;
        Arrays.sort(nums);
        for(int i=0;i<base;i++){
            if(i+1!=nums[i] ){
                return false;
            }
           
        }
        return nums[base] == nums[base-1];
    }
    
}
