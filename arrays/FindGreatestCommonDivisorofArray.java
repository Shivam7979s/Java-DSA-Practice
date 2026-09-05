package arrays;

public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        int[] nums={8,5,8,7,4};
        System.out.println(findGCD(nums));

    }
    static int findGCD(int[] nums){
        int max = nums[0];
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];

            }
        }
        return GCD(min, max);
    }
    static int GCD(int min , int max){
        while(max != 0){
            int temp = max;
            max=min%max;
            min=temp;
        }
        return min;
    }

}
