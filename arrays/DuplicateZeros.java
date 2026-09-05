package arrays;

import java.util.Arrays;



public class DuplicateZeros {
    public static void main(String[] args) {

        int[] arr = {1,0,3,0,0,4,0,5,0};
        int n=arr.length;
        int count=0;

        for (int i = 0; i < arr.length; i++) {

           

            if (arr[i] == 0) {
                int a=arr[i+1];

                arr[i+1]=0;
                arr[i+2]=a;
           
            }
        }



        System.out.println(Arrays.toString(arr));
    }
}