//Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Rupee:");
        double R= input.nextDouble();

        input.close();

        double D= R/95.61;


        System.out.println("$"+D);
    }
}
