// Write a java program to input an integer n, calculate the sum of first n natural numbers,
// //and print the numbers from n to 1 in reverse order

import java.util.Scanner;

public class SumAndReverse {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");

        int n= input.nextInt();

        int count= 0;

        input.close();

        for(int i=1; i<=n; i++){
            count= count+i;

        }
        System.out.println("Sum is: "+count);

        for(int i=n; i>=1; i-- ){
            System.out.println(i);
        }
        
    }
    
}
