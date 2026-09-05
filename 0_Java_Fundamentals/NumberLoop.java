//Write a java program to print numbers from 0 to n using a  loop, where n is given form by the user.

import java.util.Scanner;

public class NumberLoop {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");

        int n = input.nextInt();
        input.close();
        
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }

    }
    
}
