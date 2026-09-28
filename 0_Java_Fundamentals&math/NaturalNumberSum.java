//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter number:");
        int n= input.nextInt();
        input.close();
        System.out.println(sum(n));


    }
    static int sum(int n){
        int count=0;
        for(int i=1; i<=n;i++){
            count=count+i;

        }
        return count;
    }
    
}
