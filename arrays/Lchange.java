package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num={1,2,3,4,5,6};
        input.close();
        num[num.length-1]=num[num.length-1]+1;
        System.out.println(Arrays.toString(num));
    }
}
