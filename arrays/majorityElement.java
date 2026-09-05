package arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums={3,1,1,1,2,2};
        System.out.println(majority(nums));
    }
    static int majority(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
           
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;

                }
                
            }
            if(count>nums.length/2){
                ans=nums[i];
            }
            

        }
        return ans;
    }
}
