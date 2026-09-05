//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOddFunction {
    public static void main(String[] args) {
        EvenOdd();
        
    }
    static void EvenOdd(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");

        int n= input.nextInt();

        input.close();

        if(n%2==0){
            System.out.println("Number is even:");

        }
        else if(n%2!=0){
            System.out.println("Number is odd:");
        }
        else{
        System.out.println("Enter valid input");
        }
    }
  

    
}