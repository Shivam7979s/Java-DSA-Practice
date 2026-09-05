//LeetCode Question no:3300

package arrays;
public class Minimum_Element_After_Replacement_With_Digit_Sum {
    public static void main(String[] args) {
        int[] nums={999,19,199};
        System.out.println(element(nums));

    }
    static int element(int[] nums){
        int n=nums.length;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int num = nums[i];
            int ct = 0;

            while (num > 0) {
            ct += num % 10;  
            num /= 10;        
            }
            if(min>ct){
                min=ct;
            }
        }
        
        return min;
    }
    
}
