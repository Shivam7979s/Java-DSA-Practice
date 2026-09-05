package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TwoDarray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mat= new int[3][3];

        for(int i=0; i<mat.length;i++){
         
            for(int j=0; j<mat[i].length;j++){
            mat[i][j]=in.nextInt();
            }

        }
           System.out.println(Arrays.deepToString(mat));
    
       in.close();








   
    }
    
}
