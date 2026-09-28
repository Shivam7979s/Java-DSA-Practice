import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Roll; ");
        int roll = input.nextInt();

        input.close();

        switch(roll){
            case 1: System.out.println("Shivam");
            break;
            case 2: System.out.println("Ajit");
            break;
            case 3: System.out.println("Atul");
            break;
            case 4: System.out.println("Sunny");
            break;
            default: System.out.println("Not valid");
        }
    }
    
}

