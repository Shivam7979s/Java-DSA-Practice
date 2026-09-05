package arrays;
@SuppressWarnings("unused")

public class removeElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;

        System.out.println(remove(nums, val));
    }
static int[] remove(int[] nums,int val){
    int[] removed=new int[nums.length];

    int count=0;
        for(int i=0;i<nums.length;i++){
            if(val==nums[i]){
                count++;
                continue;
                
            }
            removed[i]=nums[i];
        }
        return removed;

    }
}
