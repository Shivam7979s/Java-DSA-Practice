package arrays;

import java.util.Arrays;

public class Defuse_the_Bomb {
    public static void main(String[] args) {
        int[] code={5,7,1,4};
        int k= 3;
        System.out.println(Arrays.toString(decrypt(code, k)));

    }
    static int[] decrypt(int[] code, int k){
        int n= code.length;
        int[] ans= new int[n];

        for(int i=0; i<n;i++){
             int sum=0;
            for(int j=i+1;j<=i+k;j++){
                int p=0;
                if(j<n){
                    sum+=code[j];
                }
                else if(j>=n){
                    sum+=code[p];
                    p++;
                }
            }
            ans[i]=sum;
        }
        return ans;
    }

}                               
                //[12,10,16,13]
