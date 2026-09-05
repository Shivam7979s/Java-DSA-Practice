package arrays;

import java.util.Arrays;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        int [] nums= {1,2,2,1,1,3};
        Arrays.sort(nums);
        System.out.println(unique(nums));
       

    }
    static boolean unique(int[] nums){
        int distinct = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                distinct++;
            }
        }

          // Store frequencies
        int[] freq = new int[distinct];

        int index = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                freq[index++] = count;
                count = 1;
            }
        }


           // Store last frequency
        freq[freq.length-1] = count;
        Arrays.sort(freq);
        System.out.println(Arrays.toString(freq));

        for(int i=1;i<freq.length;i++){
            if(freq[i]==freq[i-1]){
                return false;
            }
        }

        
 
        return true;
    }
    
}
