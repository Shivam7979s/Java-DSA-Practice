package arrays;



public class HeightChecker {
    public static void main(String[] args) {
        int[] nums={1,1,4,2,1,3};
        int[] exp=new int[nums.length];
        int count=0;
     

        for(int i=0;i<nums.length;i++){
           exp[i]=nums[i];
        }

        for(int i=0;i<exp.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(exp[j]<exp[j-1]){
                    int temp=exp[j-1];
                    exp[j-1]=exp[j];
                    exp[j]=temp;

                }
                else{
                    break;
                }

            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=exp[i]){
                count++;

            }
        }
       System.out.println(count);

    }
    
}
