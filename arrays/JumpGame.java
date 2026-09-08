package arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;){
            if(i == n-1){
                return true;
            }
            if(nums[i]==0){
                return false;
            }
            boolean ind = false;

            for(int j=i+1;j<=nums[i];j++){
                if(j==n-1)return true;
                if(nums[j]!=0){
                    i=j;
                    ind=true;
                    
                    break;
                }
            }
            
            if(ind == false){
                return false;
            }
            
            
           
        }
        return false;
    }
    
    
}
