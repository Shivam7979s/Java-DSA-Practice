import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = in.nextInt();


    }
    static double root(int n){
        if(n>2){
            return n;
        }
        double c=2.00;
        while(c*c<=n){
            c++;
        }
        if(c*c==n){
            return c;
        }
        else{
            return-1;

        }//icomplite \
        
    }
}
