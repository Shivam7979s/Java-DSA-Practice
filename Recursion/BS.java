package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,6,8,9,33,44,55};
        int target = 8;
        int start=0;
        int end= nums.length-1;
        System.out.println(search(nums, target, start, end ));
    }
    static int search(int[] nums,int target,int start,int end ){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            end=mid-1;
            return search(nums, target, start, end );
        }
        else{
            start=mid+1;
            return search(nums, target, start, end );
        }

    }
    
    
}
