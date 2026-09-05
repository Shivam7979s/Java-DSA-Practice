package arrays;

import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] nums={1,3,5,6,8,8,8,8,9};
        int target=33;
        int[] ans=search(nums, target);
        
        System.out.println(Arrays.toString(ans));
    }
     static int[] search(int[] nums, int target) {

    int first = -1;
    int second = -1;

    int start = 0;
    int end = nums.length - 1;

    // First Occurrence
    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            first = mid;
            end = mid - 1;
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    start = 0;
    end = nums.length - 1;

    // Last Occurrence
    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            second = mid;
            start = mid + 1;
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return new int[]{first, second};
    } 
}
