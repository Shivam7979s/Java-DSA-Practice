package arrays;

import java.util.Arrays;

public class BubbleSortInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 6, 2},
                {5, 8, 0},
                {66, 44, 99}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows * cols;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 1; j < total - i; j++) {

                int r1 = (j - 1) / cols;
                int c1 = (j - 1) % cols;

                int r2 = j / cols;
                int c2 = j % cols;

                if (matrix[r2][c2] < matrix[r1][c1]) {
                    int temp = matrix[r2][c2];
                    matrix[r2][c2] = matrix[r1][c1];
                    matrix[r1][c1] = temp;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}