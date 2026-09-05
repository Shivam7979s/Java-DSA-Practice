package arrays;

import java.util.Arrays;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures={30,40,50,60};
        System.out.println(Arrays.toString(temperatures(temperatures)));

    }
    static int[] temperatures(int[] temperatures){

        int n= temperatures.length;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            int dis=0;
            for(int j=i;j<n;j++){
                if(temperatures[i] <temperatures[j]){
                    int d=j-i;

                    dis=d;
                    break;
                
                }
                
                
            }
            ans[i]=dis;
        }
        return ans;
        
    }
    
}
