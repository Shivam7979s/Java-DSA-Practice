package arrays;

public class Union_of_two_sorted_arrays {
    public static void main(String[] args) {
        int[] nums1= {1, 2, 3, 4, 5};
        int[] nums2= {1, 2, 7};

    }
    static int[] unionArray(int[] nums1, int[] nums2){
        int n=0;

        int[] ans = {2,3,4};
        for(int i=1 ; i<nums1.length;i++){
            if(nums1[i]!=nums1[i-1]){
                n++;
            }
        }
        return ans;//  incomplete  //  
    }
    
}
