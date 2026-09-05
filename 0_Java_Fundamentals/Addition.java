import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();


        System.out.println("Enter b:");
        int b= input.nextInt();

        int sum= a+b;

         System.out.println("sum is:"+sum);

        input.close();
    }
    
}
