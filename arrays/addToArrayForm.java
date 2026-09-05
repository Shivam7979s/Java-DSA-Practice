package arrays;
import java.util.Arrays;

public class addToArrayForm {
    public static void main(String[] args) {
        int[] nums = {2,7,4};
        
        int c=0;
        int k=181;
        int count=0;


        for(int i=0;i<nums.length;i++){
            c=c*10+nums[i];
        }
        c=c+k;
        int orignal=c;
        for(;c>0;c=c/10){
            count++;
        }
        int[] ans=new int[count];
     
        for(int i=ans.length-1;orignal>0;orignal=orignal/10,i--){
            int rem=orignal%10;
            ans[i]=rem;
        }
        System.out.println(Arrays.toString(ans));
    }
} 