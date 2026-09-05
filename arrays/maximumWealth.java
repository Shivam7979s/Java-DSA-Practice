package arrays;

public class maximumWealth {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {11,55,33,565}
        };
        System.out.println(rich(arr));
    }
    static int rich(int[][] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=0;j<arr[i].length;j++){
                max=max+arr[i][j];

            }
            if(max>ans){
                ans=max;
            }
        }
        return ans;
    }
    
}
