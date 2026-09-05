import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        long n=input.nextLong();

        input.close();
        long ans=0;
        for(; n>0; n=n/10){
            long rem=n%10;

            ans=ans*10+rem;
        }
        System.out.println("Reverse Number: "+ans);


    }

    
}
