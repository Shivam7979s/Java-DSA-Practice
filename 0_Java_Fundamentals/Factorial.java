//Write a program to print the factorial of a number by defining a method named 'Factorial

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number:");
        long n = input.nextLong();

        input.close();

        Factorial(n);

    }
    static void Factorial(long n){
        long fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("factorial:"+fact);
    }
    
}
