package arrays;

import java.util.Arrays;

public class Maximum_Element_After_Decreasing_and_Rearranging {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        Arrays.sort(nums);
        nums[0]=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1] || nums[i]-1==nums[i-1] || nums[i]+1==nums[i-1]){
                if(max<nums[i]){
                    max=nums[i];
                }
                continue;
            }
            else {
                nums[i]=nums[i-1]+1;
                if(max<nums[i]){
                    max=nums[i];
                }
            }
        }




        System.out.println(Arrays.toString(nums));
        System.out.println(max);
    }
    
    
}
