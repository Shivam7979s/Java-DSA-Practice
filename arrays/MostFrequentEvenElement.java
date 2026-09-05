package arrays;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums={8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};


        int ct=-1;
      
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int count=0;

            for(int j=0;j<nums.length;j++){
                if(nums[i]%2==0 && nums[i]==nums[j] ){
                    count++;
                }
                
            }
            

            
            if(ct<count){
                ct=count;
                ans=nums[i];
            }
            if(ct==count){

            }

        }
        System.out.println(ans);
    }
    
}
