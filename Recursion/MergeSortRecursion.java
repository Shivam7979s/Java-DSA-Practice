package Recursion;

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] nums = {6,5,7,5,4,7,9,5,3,23,45,7,6,4,2,4,56,775,8,-1,-5,0};
        int[] result = mergeSort(nums);
        System.out.println(Arrays.toString(result));

    }
    static int[] mergeSort(int[] nums){
        int n = nums.length;
        if(n<2){
            return nums;
        }
        int mid = n/2;
        int[] left  = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums,mid,n));
        return merge(left,right);
    }
    static int[] merge(int[] left, int[] right){
        int l = left.length;
        int r = right.length;
        int[] ans = new int[l+r];
        int i = 0;
        int j = 0;
        int k = 0;
        while(j<l && i<r){
            if(left[j] > right[i]){
                ans[k] = right[i];
                i++;
                k++;
            }
            else{
                ans[k] = left[j];
                j++;
                k++;
            }
        }
        while(i<r){
            ans[k] = right[i];
            i++;
            k++;
        }
        while(j<l){
            ans[k] = left[j];
            j++;
            k++;
        }
        return ans;
    }
}
