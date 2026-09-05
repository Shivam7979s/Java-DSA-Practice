package arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5};
        
        System.out.println(find(arr));
    }
    static int find(int[]arr){
        int n=arr.length;
        int sum = n*(n+1)/2;

        int acsum=0;
        for(int i=0;i<arr.length;i++){
            acsum+=arr[i];
        }
        int ans=sum-acsum;
        return ans;

    } 
}
