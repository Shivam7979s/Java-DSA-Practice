import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A:");
        int a= input.nextInt();

        System.out.println("Enter B:");
        int b= input.nextInt();

        System.out.println("Enter C:");
        int c= input.nextInt();

        input.close();

        if(a>b){
            if(a>c){
                System.out.println("A is largest");
            }
            else if(a<c){
                System.out.println("C is largest");
          
            }

        }
        if(a<b){
            if(b>c){
                System.out.println("B is largest");
            }
            if(b<c){
                System.out.println("C is largest");
            }
        }
    }
    
}
