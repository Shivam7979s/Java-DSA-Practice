package Recursion;

public class product_of_digits {
    public static void main(String[] args) {
        int n=744;
        System.out.println(product(n));
    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        return n%10 * product(n/10);
    }
}
