package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Missing_Elements {
    public static void main(String[] args) {
        int[] nums={5,1};
        System.out.println(findMissingElements(nums));

    }
     static List<Integer> findMissingElements(int[] nums) {
    Arrays.sort(nums);

    List<Integer> list = new ArrayList<>();

    int min = nums[0];
    int max = nums[nums.length - 1];

    int j = 0;

    for (int i = min; i <= max; i++) {
        if (j < nums.length && nums[j] == i) {
            j++;
        } else {
            list.add(i);
        }
    }

    return list;

        
    }
    
}
