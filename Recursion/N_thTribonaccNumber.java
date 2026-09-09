package Recursion;

public class N_thTribonaccNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribonacci(25));

    }
    static int tribonacci(int n){
        if(n==0) return 0;
        if(n == 1 || n ==2) return 1;
        else return tribonacci(n-1) + tribonacci(n-2)+tribonacci(n-3);
    }
}
