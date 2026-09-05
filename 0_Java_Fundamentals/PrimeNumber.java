// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int n = input.nextInt();

        input.close();

        Prim(n);
    }

    static void Prim(int n) {

        if (n <= 1) {
            System.out.println("Number is not prime");
            return;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                System.out.println("Number is not prime");
                return;
            }
        }

        System.out.println("Number is prime");
    }
}