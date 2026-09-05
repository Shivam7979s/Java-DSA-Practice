package arrays;

public class PivotIndex {  
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(find(nums));
    }
    static int find(int[] nums){
        int rightsum=0;
        int leftsum=0;

        int pivot=-1;
        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }

       return pivot;
    }   
    
    
}

    

