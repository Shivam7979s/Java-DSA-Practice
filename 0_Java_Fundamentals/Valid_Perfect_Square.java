import java.util.Scanner;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n= in.nextInt();
       System.out.println(Square(n)); 

    }
    static boolean Square(int n){
        long s= 1;
        long e= n;
        while(s<=e){
            long mid=s+(e-s)/2;
            long square= mid*mid;
            if(square==n){
                return true;

            }
            else if(square<n){
                s= mid+1;
            }
            else{
                e= mid-1;
            }
        }
        return false;
    }
}
