//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeNumbersBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A:");
        int a=input.nextInt();

        System.out.println("Enter B:");
        int b=input.nextInt();

        input.close();
        PrimeNumbers(a,b);


    }
    static void PrimeNumbers(int a, int b){
        int i,j;
        for( i=a;i<=b;i++){
            if(i<=1){
                continue;
            }
            for ( j = 2; j <=i; j++){
                if(i%j==0)
                    break;

            }
            if(i==j){
                System.out.println(j);
            }
        }
           
        }

    }

    

