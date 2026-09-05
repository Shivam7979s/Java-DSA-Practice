package arrays;

public class Smallest_Index_With_Digit_Sum_Equal_to_Index {
    public static void main(String[] args) {
        int[] nums={1,3,2};

        System.out.println(index(nums));

    }
    static int index(int[] nums){
        for(int i=0;i<nums.length;i++){
            int dig=nums[i];
            int sum=0;
            while(dig!=0){
                int rem=dig%10;
                sum=sum+rem;
                dig=dig/10;

            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}
