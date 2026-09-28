//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Sum is:"+Sum());
        
    }
    static int Sum(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number1:");
        int num1=input.nextInt();

         System.out.println("Enter Number2:");
        int num2=input.nextInt();

        input.close();

        return num1+num2;

    }
    
}
