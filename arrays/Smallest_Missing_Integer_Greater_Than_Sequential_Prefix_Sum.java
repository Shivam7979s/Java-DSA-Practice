package arrays;

public class Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,5,6,7,8,9};
        System.out.println(missingInteger(nums));
    }
    static int missingInteger(int[] nums){
        int sum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
            }
            else{
                break;
            }
           
               
      
        }
        

        return sum;
    }
    
}
