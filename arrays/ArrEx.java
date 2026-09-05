package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ArrEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Num= new int[5];

        System.out.println("Enter Number");
        for(int i=0; i<Num.length; i++){
            Num[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(Num));
        NumberArr(Num);
        System.out.println(Arrays.toString(Num));

        input.close();
    }
    static void NameStore(Scanner input){
        
        String[] name= new String[5];

        System.out.println("Enter Names:");

        for(int i=0; i<name.length;i++){
            name[i]= input.next();    
        }
        
        System.out.println(Arrays.toString(name));

    }
    static void NumberStore(Scanner input){
       
        int[] num = new int[5];

        System.out.println("Enter Numbers:");

        for(int i=0; i<num.length;i++){
            num[i]=input.nextInt();
        }
       
        System.out.println(Arrays.toString(num));
    }
    static void NumberArr(int[] Num){

       Num[2]=55;

    }
}
