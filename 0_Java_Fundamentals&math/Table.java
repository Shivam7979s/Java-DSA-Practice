import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        System.out.println("Enter number:");
        Scanner input = new Scanner(System.in);

        int n= input.nextInt();
        input.close();

        for(int i=n , j=1; i<=n*10;j++, i=i+n){
            System.out.println(n + "x " +j +" = "+i);
        }
    }
    
}
