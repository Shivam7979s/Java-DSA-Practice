package arrays;

public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target=2;
   
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                System.out.println(i);
            }
         
        }

        System.out.println(nums.length);
       
    }

}
