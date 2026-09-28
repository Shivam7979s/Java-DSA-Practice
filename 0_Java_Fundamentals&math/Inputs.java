import java.util.Scanner;

public class Inputs {
    public static void main(String args[]){
        System.out.println("Enter Roll no:");
        Scanner input = new Scanner(System.in);
        int roll= input.nextInt();
        System.out.println("your roll no is: "+roll);
        
        input.close();
    }
    
}
