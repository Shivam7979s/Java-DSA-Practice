package Recursion;

import java.util.ArrayList;


public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] nums = {12, 45,7, 7, 23, 89, 34, 56};
        int target = 7;

        ArrayList <Integer> list = new ArrayList<>();

        System.out.println(search(nums, target));
        
        System.out.println(index(nums, target,0));
        
        System.out.println(allindex(nums, target, 0, list));

    }
    static boolean search(int[] nums, int target ){
        return helper(nums,target,0);
    }
    static boolean helper(int[] nums,int target, int i){
        if(i == nums.length){
            return false;
        }
        return nums[i] == target || helper(nums,target,i+1);
    }
    static int index(int[] nums,int target, int j){
        if(j == nums.length){
            return -1;
        }
        if(nums[j] == target){
            return j;
        }
        return index(nums, target, j+1);
    }
    static ArrayList allindex(int[] nums,int target, int i,ArrayList <Integer> list){
        if(i == nums.length){
            return list;
        }
        if(nums[i] == target){
            list.add(i);
        }
        return allindex(nums, target, i+1,list);
    }
}
