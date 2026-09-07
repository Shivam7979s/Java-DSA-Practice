package Recursion;

public class Check_if_the_array_is_sorted {
    public static void main(String[] args) {
        int[] nums = {99,8,7,6,5,4,3,2,1};
        System.out.println(check(nums));

    }
    static boolean check(int[] nums){
        if(nums[0]>nums[nums.length-1]){
            return helper1(nums,1);
        }
        else{
            return helper2(nums,1);
        }
    }
    static boolean helper2(int[] nums, int i){
        
        if(i==nums.length){

            return true;
        }
        return nums[i]>=nums[i-1] && helper2(nums,i+1);
        

    }
    static boolean helper1(int[] nums, int i){
        
        if(i==nums.length){

            return true;
        }
        return nums[i]<=nums[i-1] && helper1(nums,i+1);
        

    }
    
}
