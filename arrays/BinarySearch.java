package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=7;
        int start=0;
        int end=arr.length-1;

        System.out.println(Search(arr, target ,start,end));      // this is normal binary search
        System.out.println(recursive_binary_search(arr, target, start, end));   // this is recursive binary search 

    }
    static int Search(int[] arr,int target ,int start,int end){  // this is normal binary search

      
        while(start<=end){
            int mid = start+(end-start);
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    static int recursive_binary_search(int[] arr,int target,int start,int end){  // this is recursive binary search 
        if(start>end){
            return -1;
        }

        int mid=start+(end-start);
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            start=mid+1;
            return recursive_binary_search(arr, target, start, end);
        }
        else{
            end=mid-1;
            return recursive_binary_search(arr, target, start, end);
        }
    }
      
} 
