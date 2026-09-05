package arrays;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(average(nums, k));
    }
    static double average(int[] nums, int k){

        double ans=0.00;

        for(int i=0;i<=k;i++){

            ans+=nums[i];

        }
        return ans/k;
    }
    
}
