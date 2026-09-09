package Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {3,6,4,2,6,8,9,7,5,3,9};
        mergeSort(nums , 0, nums.length);
        System.out.println(Arrays.toString(nums));


    }
    static void mergeSort(int[] nums ,int start ,int end){
        int n = nums.length;
        if(end - start <= 1){
            return ;
        }
        int mid = start + ( end - start )/2;
         mergeSort(nums,start,mid);
         mergeSort(nums,mid,end);
         merge(nums , start ,mid , end);
    }
    static void merge(int[] nums, int start , int mid , int end){


        int[] ans = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while( (i < mid) && (j < end)){
            if(nums[i] < nums[j]){
                ans[k] = nums[i];
                i++;
                k++;
            }
            else {
                ans[k] = nums[j];
                j++;
                k++;
            }
        }
        while (i < mid){
            ans[k] = nums[i];
            k++;
            i++;
        }
        while (j < end){
            ans[k] = nums[j];
            k++;
            j++;
        }
        for (int l = 0; l < ans.length; l++) {
            nums[start + l] =ans[l];
        }// This is working but i, do not know it is working.
    }
}
