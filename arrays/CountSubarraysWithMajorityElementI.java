package arrays;

public class CountSubarraysWithMajorityElementI {
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        int target=2;
        System.out.println(element(nums, target));

    }
    static int element(int[] nums,int target){
        int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    count++;
                }
                int len=j-i+1;

                if(count>len/2){
                    ans++;
                }
            }
        }
        return ans;
    }
    
}
