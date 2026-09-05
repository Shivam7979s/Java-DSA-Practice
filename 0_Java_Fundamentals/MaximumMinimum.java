//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.v

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1:");
        int a=input.nextInt();

        System.out.println("Enter num2:");
        int b= input.nextInt();

        System.out.println("Enter bum3:");
        int c=input.nextInt();

        input.close();

        Max(a,b,c);

        Min(a,b,c);
    }
    static void Max(int a,int b,int c){

        int max=a;
        if(b>max){
            max=b;

        }
        if(c>max){
            max=c;

        }
        System.out.println("Maximum number is:"+max);


    }
    static void Min(int a, int b, int c){

        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        System.out.println("Minimum number is:"+min);

    }
    
}
