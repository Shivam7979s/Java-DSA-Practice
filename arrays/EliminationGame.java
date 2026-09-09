package arrays;

import java.util.Arrays;

public class EliminationGame {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(lastRemaining(n));
    }
    static int lastRemaining(int n){
        int[] nums = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = i+1;
        }
        int i = 0;
        int j = n-1;
        int k= 0;
        boolean flag = true;
        while (i < j){
            if (k % 2 == 0){
                nums[i] = 0;
                i++;
                flag = false;
            }
            else{
                nums[j] = 0;
                j--;
                flag = true;
            }
            k++;

        }
        System.out.println(Arrays.toString(nums));
        if (flag == true){
            return nums[i];
        }
        else{
            return nums[j];
        }



    }
}
