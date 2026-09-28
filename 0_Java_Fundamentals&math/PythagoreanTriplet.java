//Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       

        System.out.println("Enter a:");
        int a=input.nextInt();

         System.out.println("Enter b:");
        int b=input.nextInt();

         System.out.println("Enter c:");
        int c=input.nextInt();

        input.close();






        Pythagorean(a, b, c);
        
    }
    static void Pythagorean(int a,int b, int c){
        int A=a*a;
        int B=b*b;
        int C=c*c;

        if(A+B==C){
            System.out.println("given triplet is a Pythagorean triplet");

        }
         else{
             System.out.println("given triplet is not a Pythagorean triplet");


         }




    }

}