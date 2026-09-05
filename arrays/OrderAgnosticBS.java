package arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={99,98,88,87,78,75,66,50,44,33,32,22,11,9,3,2};
        int target = 2;
        System.out.println(search(arr, target));


        
    }
    static int search(int[] arr, int target){
        if(arr[0]<arr[arr.length-1]){
            for(int start=0,end=arr.length-1;start<=end;){
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        else{
            for(int start=0,end=arr.length-1;start<=end;){
                int mid=start+(end-start)/2;
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;

        
    }
}
