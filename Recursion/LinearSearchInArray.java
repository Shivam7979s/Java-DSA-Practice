package Recursion;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 23, 89, 34, 56};
        int target = 7;
        System.out.println(search(nums, target));

    }
    static boolean search(int[] nums, int target ){
        return helper(nums,target,0);
    }
    static boolean helper(int[] nums,int target, int i){
        if(i==nums.length){
            return false;
        }
        if(nums[i] == target){
            return true;
        }
        return helper(nums,target,i+1);
        

    }
}
