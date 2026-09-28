//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class CircleAreaCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("'Enter redis");
        double r=input.nextDouble();
        input.close();

        System.out.println("area of circle:"+Area(r));
        System.out.println("circumference of circle:"+Circumference(r));

        
    }
    static double Area(double r){
        double area= 3.14159265359*r*r;                                     //Pi=3.14159265359
        return area;
    }
    static double Circumference(double r){
        double circumference= 2*3.14159265359*r;
        return circumference;
    }

    
}
