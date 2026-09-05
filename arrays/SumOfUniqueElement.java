package arrays;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,2};

        int ans=0;

        for(int i=0;i<nums.length;i++){
            int count=0;

            for(int j=0;j<nums.length;j++){

                if(i!=j && nums[i]==nums[j]){
                    count=1;
                }
            }

            if(count==0){
                ans+=nums[i];
            }
        }

        System.out.println(ans);
    }
}