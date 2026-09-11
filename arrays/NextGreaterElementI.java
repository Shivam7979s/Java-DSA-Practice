package arrays;

import java.util.Arrays;
/*================================================================
  |                      INCOMPLETE                              |
  |                      INCOMPLETE                              |
  |                      INCOMPLETE                              |
  |===============================================================
 */
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums2.length;
        int[] ans = new int[nums1.length];
        int k = 0;
        int p = 0;
        for (int i = 0; i < len; i++) {
            int d = -1;
            if(nums2[i] == nums1[k] && k < nums1.length){
                for (int j = i; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        d = nums2[j];
                    }

                }
                k++;
            }
            if(p<nums1.length){
                ans[p]= d;
                p++;
            }

        }
        return ans;
    }
}
