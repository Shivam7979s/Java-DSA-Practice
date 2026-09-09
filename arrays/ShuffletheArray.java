package arrays;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] nums = {2,7};
        int n = nums.length/2;

        System.out.println(Arrays.toString(shuffle(nums , n)))    ;
    }
    static int[] shuffle(int[] nums ,  int n){
        int[] ans = new int[n*2];
        int i = 0;
        for (int j = 0; j < n; j++) {
            ans[i++] = nums[j];
            ans[i++] = nums[n+j];

        }
        return ans;

    }
}
