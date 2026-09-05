package Bitwise_Operators;

public class findunique {
    public static void main(String[] args) {
        int[] nums={1,4,1,5,9,9,5,4,-9};
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans= ans^nums[i];
        }
        System.out.println(ans);
    }
    
}
