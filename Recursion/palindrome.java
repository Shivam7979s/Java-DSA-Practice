package Recursion;

public class palindrome {
    public static void main(String[] args) {
        int n=543;
        int r=0;
        System.out.println(find(n, r));
        System.out.println(r);
    }
    static int find(int n,int r){
        if(n/10==0){
            return n;
        }
        int rem = n%10;
        r=r*10+rem;
        return find(n/=10,r);
    
    }
    
}
