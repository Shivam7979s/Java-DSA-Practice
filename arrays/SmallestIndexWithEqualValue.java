package arrays;

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(findSmallest(nums));

    }
    static int findSmallest(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i % 10 == nums[i]){
                return i;
            }

        }
        return -1;
    }
}
