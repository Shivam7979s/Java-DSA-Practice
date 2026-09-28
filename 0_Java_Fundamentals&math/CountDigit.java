import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number: ");
        long n=input.nextLong();

        System.out.println("Enter number you want to count: ");
        int ct=input.nextInt();

        input.close();

        int count=0;

        for(; n>0;n=n/10){

            long rem=n%10;
            if(rem==ct){
                count= count+1;
            }

        }
        System.out.println(count);
    }
    
}
