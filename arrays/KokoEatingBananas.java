package arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] nums={30,11,23,4,20};
        int h=5;
        System.out.println(banans(nums, h));
    }
    static int banans(int[] nums,int h){
        double k=1;
        for(int i=0;i<nums.length;i++){

            System.out.println(k);
            k+=(double)nums[i]/h;
        }
        
        return (int)k;
    }
    
}
