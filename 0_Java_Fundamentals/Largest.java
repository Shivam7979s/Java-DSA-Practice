import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A:");
        int a= input.nextInt();

        System.out.println("Enter B:");
        int b= input.nextInt();

        System.out.println("Enter C:");
        int c= input.nextInt();

        input.close();

        int max = a;
        if(b>max){
            max =b;
        }
        if(c>max){
            max= c;
        }

        System.out.println("Largest number is: "+max);

    }

}