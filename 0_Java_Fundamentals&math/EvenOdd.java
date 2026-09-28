//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();

        input.close();

        if(n%2==0){
            System.out.println("Given number is even:");

        }
        else{
            System.out.println("given number is Odd:");
        }
    }
    
}
