//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.println("Enter name:");

        Scanner input = new Scanner(System.in);
        String name=input.nextLine();

        input.close();

        String greeting= "Welcome ";

        System.out.println(greeting +name);

    }
    
}
