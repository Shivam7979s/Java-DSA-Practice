//Calculate Batting Average

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Total Run:");
        double Run=input.nextInt();

        System.out.println("Enter Number of Dismissals:");
        double Dismissals= input.nextInt();

        input.close();

       double Average= Run/Dismissals;
       System.out.println("Average:"+Average);


    }
    
}
