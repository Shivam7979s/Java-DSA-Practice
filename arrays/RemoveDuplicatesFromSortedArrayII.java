package arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums){
        int n = nums.length;
        int ind = 0;
        for(int i = 0; i<n; i++){
            if(i<n-2 && nums[i] == nums[i+2]){
                continue;
            }
            else{
                nums[ind]=nums[i];
                ind++;
            }
        }
        return ind;
    }
    
}
