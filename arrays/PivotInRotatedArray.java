package arrays;

public class PivotInRotatedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        int target=3;
        
        // findpivot(nums);
        // if(findpivot(nums)==-1){
        //     normalsearch(nums,target);
        //     System.out.println(normalsearch(nums, target));

        // }
        // else{
            System.out.println(search(nums, target,findpivot(nums)));
        // }

        
    }
 
    static int findpivot(int[] nums){
        
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]<=nums[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            
          
        }
        return -1;

    }
    static int normalsearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;

    } 
    static int search(int[] nums,int target,int pivot){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(nums[pivot+1]<target  && target<nums[nums.length-1]){
                start=mid+1;

            }
            else if(nums[pivot+1]>target  && target>nums[nums.length-1]){
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
// not working