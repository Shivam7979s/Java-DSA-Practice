package Recursion;

import java.util.Arrays;

public class setcolor {
    public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    sortColors(nums);
    System.out.println(Arrays.toString(nums));

    }
    static void sortColors(int[] nums){
        nums = mergeSort(nums);
    }
    static int[] mergeSort(int[] nums){
        int n = nums.length;
        if(n < 2){
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
        while ((j < l) && (i < r)){
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
        while (i < r){
            ans[k] = right[i];
            i++;
            k++;
        }
        while (j < l){
            ans[k] = left[j];
            j++;
            k++;
        }
        return ans;
    }
}
