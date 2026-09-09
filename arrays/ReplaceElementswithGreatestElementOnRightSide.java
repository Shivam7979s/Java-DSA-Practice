package arrays;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(nums)));
    }
    static int[] replaceElements(int[] nums){
        int n =  nums.length;
        int[] ans = new int[n];
        for(int i =0;i<n;i++){
            int m = -1;
            for(int j =i+1;j<n;j++){
                m = Math.max(m,nums[j]);
            }
            ans[i] = m;
        }
        return ans;
    }
}
