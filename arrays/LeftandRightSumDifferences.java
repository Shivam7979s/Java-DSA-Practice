//LeetCode Question no:2574;

package arrays;

import java.util.Arrays;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        System.out.println(Arrays.toString(answer(nums)));
    }
    static int[] answer(int[] nums){
        int n=nums.length;

        int[] left_sum=new int[n];
        int[] right_sum=new int[n];
        int[] ans=new int[n];

        int sum=0;
        for(int i=1;i<n;i++){
            sum+=nums[i-1];
            left_sum[i]=sum;
        }
        sum=0;
        for(int i=n-2;i>=0;i--){
            sum+=nums[i+1];
            right_sum[i]=sum;
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(left_sum[i]-right_sum[i]);
        }
        return ans;
    }
}
