package arrays;

public class BsInMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {17, 18, 19, 20},
            {21, 22, 23, 24},
            {25, 26, 27, 28},
            {29, 30, 31, 32}
        };
        int target=25;
        System.out.println(search(matrix, target));

    }
    static boolean search(int[][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;
        while (r<matrix.length && c>=0) {
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c] <target){
                r++;
            }
            else{
                c--;
            }
            
        }
        return false;
    }
    
}
