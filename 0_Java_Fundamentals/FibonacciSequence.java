import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n= input.nextInt();

        input.close();

        int a= 0;
        int b= 1;
        int temp;
        for(int i = 2; i<=n; i++){
            temp=a;
            a=b;
            b=temp+b; 
        }
        System.out.println(b);
    }
}
