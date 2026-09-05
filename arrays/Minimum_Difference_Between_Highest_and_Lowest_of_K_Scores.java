package arrays;
import java.util.Arrays;

public class Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores {
    public static void main(String[] args) {
        int[] nums={9,4,1,7};
        int k=2;
        System.out.println(difference(nums, k));
    }
    static int difference(int[] nums,int k){
        Arrays.sort(nums);
        int n= nums.length;

        if(k<2) return 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int temp=nums[i+k-1]-nums[i];
            if(min>temp){
                min=temp;
            }
        }
        return min;
    }
}
