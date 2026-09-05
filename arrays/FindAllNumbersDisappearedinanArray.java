package arrays;

import java.util.ArrayList;

import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7,5};
        
        

        System.out.println(findDisappearedNumbers(nums));

    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i])-1;
           
            if(nums[index]>0){
                nums[index]*=-1;
            }
         
            
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                list.add(i+1);
            }
        }
      
        return list;
    }
}
