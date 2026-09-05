package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class createTargetArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4};
        int[] index={0,1,2,3,0};

        ArrayList<Integer> list = new ArrayList<>();
        

        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
           

            
           
        }
       int[] target=new int[list.size()];
       for(int i=0;i<target.length;i++){
        target[i]=list.get(i);
        
       }
        
       System.out.println(Arrays.toString(target));
    }

    
}
