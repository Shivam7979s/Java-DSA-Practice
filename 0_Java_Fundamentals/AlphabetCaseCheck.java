import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Alphabet");
        char c= input.next().trim().charAt(0);



        input.close();

        if(c>='A' && c<='Z'){
            System.out.println("Alphabet is uppercase");

        }
        else if(c>='a' && c<='z'){
             System.out.println("Alphabet is Lowercase");

        }
        else{
            System.out.println("not an Alphabet");
        }
        
    }

    
}