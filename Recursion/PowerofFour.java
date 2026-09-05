package Recursion;

public class PowerofFour {
    public static void main(String[] args) {
        int n= 16;
        System.out.println(power(n));
    }
    static boolean power(int n){
        if(n==1){
            return true;
        }
        if(n<=1 || n%4!=0){
            return false;
        }
        return power(n/=4);
    }
}
