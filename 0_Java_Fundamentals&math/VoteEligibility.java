//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Age();
        
    }
    static void Age(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age=input.nextInt();

        input.close();

        if(age>=18){
            System.out.println("person can vote!");
        }
        else{
            System.out.println("Person can not vote!");
        }
        
    }


    
}
