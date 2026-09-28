import java.util.Scanner;

public class IF {
    public static void main(String args[]){
        System.out.println("Enter user age:");
        Scanner input =new Scanner(System.in);
        int age = input.nextInt();

        if(age>=18){
            System.out.println("User can vote!");

        }
        else{
             System.out.println("User can not vote!");

        }

        input.close();
    }
    
}
