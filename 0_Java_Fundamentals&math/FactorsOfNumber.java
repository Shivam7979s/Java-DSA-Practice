import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");

        int n= input.nextInt();
        input.close();
        

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }   
}
