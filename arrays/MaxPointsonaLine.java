package arrays;

public class MaxPointsonaLine {
    public static void main(String[] args) {
        int[][] points={
            {1,1},
            {3,2},
            {5,3},
            {4,1},
            {2,3},
            {1,4}
        };

        System.out.println(count(points));
    }
    static int count(int[][] points){
        int[] nums=new int[points.length];
        for(int i=0;i<points.length;i++){
            for(int j=1;j<points.length;j++){
                nums[i]=points[i][j]+points[i][j-1];
            }
        }
        int ct=0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ct++;
                }
            }
        }
        return ct;
    }
    
}
