package arrays;

public class MinimumDistancetotheTargetElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,5};
        int target = 5;
        int start = 2;
        System.out.println(getMinDistance( nums,target,start));

    }
    static int getMinDistance(int[] nums, int target, int start){
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            if ( nums [i] == target){
                ans = Math.min(ans, Math.abs(i - start));
            }
        }
        return ans;
    }
}
