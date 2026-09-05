package Bitwise_Operators;


public class FindTheI_thBit {
    public static void main(String[] args) {
        int n = 17;
        int i = 5;

        int mask = 1 << (i - 1);
        int ans = n & mask;

       if(ans==0){
        System.out.println(0);
       }
       else{
        System.out.println(1);
       }
        
    }
}