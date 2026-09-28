// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a="0" ;
        int sum= 0;

        for(int i=1; ; i++){
    
            System.out.println("Enter number");
            a= input.nextLine();

            if(a.equals("x")){
                break;
            }
            
            int num = Integer.parseInt(a);
            sum= sum+num;
        }
        System.out.println("sum of all: "+sum);
        input.close();

    }
    

    
}
