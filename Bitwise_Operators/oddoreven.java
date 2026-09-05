package Bitwise_Operators;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter number:");
        int n=input.nextInt();
        input.close();
        if((n & 1 )== 1){
            System.out.println("number is odd");
        }
        else{
            System.out.println("number is even");
        }
        
    }
    
}
