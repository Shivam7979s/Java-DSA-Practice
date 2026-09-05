//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a= input.nextInt();
        System.out.println("Enter 2nd number:");
        int b= input.nextInt();
        System.out.println("Enter operator (+, -, *, /,%) ");
        String operator = input.next();
        if(operator.equals("+")){
            int ans=a+b;
            System.out.println("Ans is:"+ans);      
        }
        if(operator.equals("-")){
            int ans=a-b;
            System.out.println("Ans is:"+ans);
        }
         if(operator.equals("*")){
            int ans=a*b;
            System.out.println("Ans is:"+ans);
        }
         if(operator.equals("/")){
            int ans=a/b;
            System.out.println("Ans is:"+ans);
        }
         if(operator.equals("%")){
            int ans=a%b;
            System.out.println("Ans is:"+ans);
        }
        else{
            System.out.println("Enter valid operator!");
        }
        input.close();
    }
}
