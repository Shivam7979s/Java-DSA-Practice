package arrays;
public class Findmin {
    public static void main(String[] args) {
        int[] arr = {4,2,4,6,7,-854,2,1};
        System.out.println("min:"+min(arr));

        System.out.println("mix:"+max(arr));

        
    }
    static int min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    
    
}
