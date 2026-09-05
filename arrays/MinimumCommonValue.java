package arrays;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] num1={1,2,3,6};
        int[] num2={4,5};
        System.out.println(common(num1, num2));

    }
    static int common(int[] nums1,int[] nums2){

       int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
    
}
