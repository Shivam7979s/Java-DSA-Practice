//Take integer inputs till the user enters 0 and print the largest number from all

import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;

        for(int i=1; ; i++){
            System.out.println("Enter number:");
            int n= input.nextInt();
            if(n==0){
                break;
            }
            if(largest<n){
                largest=n;
            }

        }
        input.close();
        System.out.println("Largest number is:"+largest);
    }
    
}
