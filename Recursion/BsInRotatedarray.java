package Recursion;

public class BsInRotatedarray {
    public static void main(String[] args) {
        int[] nums = {8,9,10,11,12,4,5,6,7};
        int target = 6;
        int start=0;
        int end=nums.length-1;
        System.out.println(bs(nums, start, end, target));

    }
    static int bs(int[] nums,int start,int end, int target){
        
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }

        if (nums[start] <= nums[mid]) {

            // Target is inside the left sorted half
            if (nums[start] <= target && target < nums[mid]) {
                return bs(nums, start, mid - 1, target);
            }

            // Target must be in right half
            return bs(nums, mid + 1, end, target);
        }

        // Right half is sorted
        else {

            // Target is inside the right sorted half
            if (nums[mid] < target && target <= nums[end]) {
                return bs(nums, mid + 1, end, target);
            }

            // Target must be in left half
            return bs(nums, start, mid - 1, target);
        }
    }
    
}
