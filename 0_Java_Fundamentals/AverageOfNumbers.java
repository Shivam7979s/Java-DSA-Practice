//Calculate Average Of N Numbers

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N;");
        int N=input.nextInt();
        float Sum=0;

        for(int i=1; i<=N;i++){
            System.out.println("Enter Numbers:");
            float Numbers=input.nextInt();

            Sum=Sum+Numbers;

        }
        input.close();
        
        float Average=Sum/N;
        System.out.println("Average:"+Average);

        
    }
    
}
