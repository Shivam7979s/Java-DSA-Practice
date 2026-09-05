package Recursion;

public class Binary_search {
    public static void main(String[] args) {
      int[] nums={1,2,4,5,6,7,8};
      int target=1;
      int start=0;
      int end=nums.length-1;
      System.out.println(search(nums, target, start, end));
    }
    static int search(int[] nums,int target,int start,int end){
      int mid=start+(end-start)/2;
      if(start>end){
        return -1;
      }
      if(nums[mid]==target){
        return mid;
      }
      if(target>nums[mid]){
        start=mid+1;
        return search(nums, target, start, end);
      }
      else{
        end=mid-1;
       return search(nums, target, start, end);
      }
    }
}
