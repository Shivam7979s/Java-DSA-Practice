//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
/*Marks        Grade 
91-100         A+
81-90          A
71-80          B+
61-70          B 
51-60          C+
41-50          c
<=40          Fail 
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks= input.nextInt();

        input.close();

        Grades(marks);




    }
    static void Grades(int marks){
        if(marks>=91 && marks <=100){
            System.out.println("A+");
           return;
        }
        if(marks>=81 && marks<=90){
            System.out.println("A");
            return;
        }
        if(marks>=71 && marks<=80){
            System.out.println("B+");
            return;
        }
        if(marks>=61 && marks<=70){
            System.out.println("B");
            return;
        }
        if(marks>=51 && marks<=60){
            System.out.println("C+");
            return;
        }
        if(marks>=41 && marks<=50){
            System.out.println("C");
            return;
        }
        if(marks>=0 && marks<=40){
            System.out.println("Fail");
            return;
        }
        else{
            System.out.println("invalid marks!");
        }

    }
    
}
