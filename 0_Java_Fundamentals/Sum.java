
import arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));


    }
    static  List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for( int i = 0; i < n; i++ ){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for( int j = i + 1; j < n; j++ ){
                if (j > 0 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for( int k = j + 1; k < n; k++ ){
                    if (k > 0 && nums[k] == nums[k - 1]) {// incomp
                        continue;
                    }
                    if( nums[i] + nums[j] + nums[k] == 0  ){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        list.add(temp);
                    }
                }
            }

        }
        return list;
    }
}
