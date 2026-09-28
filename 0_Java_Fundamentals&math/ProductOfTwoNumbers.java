//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Product of two numbers:"+product());
        
    }
    static int  product(){
        Scanner  input = new Scanner(System.in);

        System.out.println("Enter Number1:");
        int num1= input.nextInt();

        System.out.println("Enter Number2:");
        int num2= input.nextInt();

        input.close();

        return num1*num2;
    }

    
}
