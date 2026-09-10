package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,-1,9,5,6,7,9};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    static void quickSort(int[] nums , int low , int high){
        if(low >= high){
            return;
        }
        int s =  low;
        int e = high;
        int mid = (low+high)/2;
        int pivot = nums[mid];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }
                nums[s] = nums[e];
                while(nums[e] > pivot){
                    e--;
                }
                if(s <= e){
                    int temp = nums[s];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(nums,low,e);
        quickSort(nums,s,high);

    }
}
