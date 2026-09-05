package arrays;
public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7},
            {8,9,10}
        };
        System.out.println("max:"+Max(arr));
        System.out.println("min:"+Min(arr));

    }
    static int Max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    static int Min(int[][] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
