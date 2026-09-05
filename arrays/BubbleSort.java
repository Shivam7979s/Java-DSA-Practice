package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {
        83, 17, 92, 45, 6, 71, 28, 54, 99, 13,
        37, 62, 4, 88, 25, 76, 19, 95, 41, 58,
        2, 84,0, 33, 67, 11, 90, 23, 73, 15, 50,
        97, 8, 61, 29, 86, 39, 70, 21, 94, 47,
        5, 81, 35, 66, 14, 89, 26, 78, 1, 53
        };
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(nums));
    }

    
}
