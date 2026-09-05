import java.util.Scanner;

public class FunctionExample {
    public static void main(String[] args) {
        Hello();

        // System.out.println(Greeting1());

        Scanner input= new Scanner(System.in);

        System.out.println("Enter Name:");
        String Name = input.next();
        System.out.println(Greeting2(Name));

        // Sum1();

        // int ans=Sum2();
        // System.out.println("Sum is:"+ans);

        // System.out.println("Enter A:");
        // int A=input.nextInt();

        // System.out.println("Enter B:");
        // int B= input.nextInt();

        input.close();

        // int Ans=Sum3(A,B);
        // System.out.println("Sum is:"+Ans);

    }
    static void Hello(){
        System.out.println("Hello!");
    }
    static String Greeting1(){
        String great= "Hello Shivam!";
        return great;

    }
    static String Greeting2(String name){
        String greet= "Welcome "+name;
        return greet;


    }
   
    static void Sum1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A:");
        int A=input.nextInt();

        System.out.println("Enter B:");
        int B=input.nextInt();
        input.close();

        int Sum= A+B;
        System.out.println("Sum :"+Sum);
    }
    static int Sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A:");
        int A=input.nextInt();

        System.out.println("Enter B:");
        int B=input.nextInt();

        input.close();


        int Sum= A+B;
        return Sum;
    }
    static int Sum3(int A,int B){
        int sum= A+B;
        return sum;

    }

}
