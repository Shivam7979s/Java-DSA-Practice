/*
================================
      STUDENT MANAGEMENT
================================

1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Show Top Student
7. Show Statistics
8. Exit

Enter your choice:
 */
package project;

import java.util.Scanner;

public class StudentManagementSystem {
    static int index = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentSystem[] students = new StudentSystem[100];
        while (true) {
            System.out.println("================================\n" +
                    "      STUDENT MANAGEMENT\n" +
                    "================================");

            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Top Student");
            System.out.println("7. Show Statistics");
            System.out.println("8. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();


            if (choice == 1) {
                addstudent(students , sc);
            } else if (choice ==2) {
                dilplayallstudent(students);

            }
            else if (choice == 3) {
                System.out.println("Enter Student Roll Number:");
                int roll = sc.nextInt();
                searchstudent(students, roll);
            }
            else if (choice == 4) {
                System.out.println("Enter Student Roll Number:");
                int roll = sc.nextInt();
                sc.nextLine();
                updatestudent(students,roll ,sc);
            }
            else if (choice == 5) {
                System.out.println("Enter Student Roll Number:");
                int roll = sc.nextInt();
                deletestudent(students, roll);
            }
            else if (choice == 6) {
                topstudent(students);
            }
            else if (choice == 7) {
                Statistics(students);
            }
            else if (choice == 8) {
                break;
            }
            else {
                System.out.println("Invalid Choice");
            }
        }

    }
    static void addstudent(StudentSystem[] students , Scanner sc) {
        if (index >= students.length) {
            System.out.println("Student storage is full!");
            return;
        }
        sc.nextLine();
        System.out.println("enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("enter the age of the student:");
        int age = sc.nextInt();
        System.out.println("enter the roll number of the student:");
        int roll = sc.nextInt();
        while( true ){
            if(isrollexit(students, roll)){
                System.out.println("Student already exists!");
                System.out.println("Enter valid Roll Number:");
                roll = sc.nextInt();
            }
            else{
                break;
            }
        }

        System.out.println("enter the marks of the student:");
        float marks = sc.nextFloat();
        while(true){
            if(marks < 0.0 || marks > 100.0){
                System.out.println("Marks must be between 0.0 and 100!");
                System.out.println("Enter valid marks:");
                marks = sc.nextFloat();
            }
            else{
                break;
            }
        }

        students[index] = new StudentSystem(roll, name, age, marks);
        index++;

        System.out.println("Student added successfully!");
    }
    static void dilplayallstudent(StudentSystem[] students){
        if(index == 0){
            System.out.println("no student found!");
        }
        else {
            for (int i = 0; i < index; i++) {
                students[i].displayStudent();

            }
        }
    }
    static void searchstudent(StudentSystem[] students,int roll){
        if(index == 0){
            System.out.println("no student found!");
        }
        else {
            boolean flag = false;
            for (int i = 0; i < index; i++) {
                if (students[i].rollNo == roll) {

                    students[i].displayStudent();
                    flag = true;
                }
            }
            if(!flag){
                System.out.println("Student not found!");
            }
        }
    }
    static void updatestudent(StudentSystem[] students,int roll , Scanner sc){
        if(index == 0){
            System.out.println("no student found!");
        }
        else {
            boolean flag = false;
            for (int i = 0; i < index; i++) {
                if (students[i].rollNo == roll) {
                    flag = true;
                    System.out.println("enter the name of the student:");
                    String name = sc.nextLine();
                    System.out.println("enter the age of the student:");
                    int age = sc.nextInt();
                    System.out.println("enter the marks of the student:");
                    float marks = sc.nextFloat();
                    System.out.println("enter the roll number of the student:");
                    int rollNo = sc.nextInt();
                    while( true ){
                        if(isrollexit(students, roll) && students[i].rollNo != rollNo){
                            System.out.println("Student already exists!");
                            System.out.println("Enter valid Roll Number:");
                            roll = sc.nextInt();
                        }
                        else{
                            break;
                        }
                    }
                    students[i].changeName(name);
                    students[i].changeAge(age);
                    students[i].changeMarks(marks);
                    students[i].changeRollNo(rollNo);
                    break;
                }
            }
            if (!flag) {
                System.out.println("Student not found!");
            }
        }
        System.out.println("Student updated successfully!");
    }
    static void deletestudent(StudentSystem[] students,int roll){
        if(index==0){
            System.out.println("Student not found!");
        }
        else {
            boolean flag = false;
            for (int i = 0; i < index; i++) {
                if (students[i].rollNo == roll) {

                    for (int j = i; j < index - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    index--;
                    students[index] = null;

                    flag = true;
                    System.out.println("Student deleted successfully!");
                    break;
                }
            }
            if (!flag) {
                System.out.println("Student not found!");
            }
        }
    }
    static void topstudent(StudentSystem[] students){
        if(index == 0){
            System.out.println("Student not found!");
        }
        else {
            StudentSystem topstudent = students[0];
            for (int i = 1; i < index; i++) {
                if (topstudent.Marks < students[i].Marks) {
                    topstudent = students[i];
                }
            }
            System.out.println("========== TOP STUDENT ==========");
            System.out.println("Name: " + topstudent.Name);
            System.out.println("Roll number: " + topstudent.rollNo);
            System.out.println("Age: " + topstudent.Age);
            System.out.println("Marks: " + topstudent.Marks);
        }
    }
    static void Statistics(StudentSystem[] students){

        if(index == 0){
            System.out.println("Students not found!");
        }
        else {
            StudentSystem topstudent = students[0];
            StudentSystem loweststudent = students[0];
            int passed = 0;
            int failed = 0;
            float totalmarks = 0.0f;
            StudentSystem olderstudent = students[0];
            StudentSystem youngstudent = students[0];
            for (int i = 0; i < index; i++) {
                if (topstudent.Marks < students[i].Marks) {
                    topstudent = students[i];
                }
                if (students[i].Marks >= 30.0) {
                    passed++;
                }
                if (students[i].Marks < 30.0) {
                    failed++;
                }
                if (loweststudent.Marks > students[i].Marks) {
                    loweststudent = students[i];
                }
                if (youngstudent.Age > students[i].Age) {
                    youngstudent = students[i];
                }
                if (olderstudent.Age < students[i].Age) {
                    olderstudent = students[i];
                }
                totalmarks += students[i].Marks;

            }
            float avrage = totalmarks / (float) index;
            System.out.println("========== STATISTICS ==========");
            System.out.println("Total Students   : " + index);
            System.out.println("Highest Mark     : " + topstudent.Marks);
            System.out.println("Lowest Mark      : " + loweststudent.Marks);
            System.out.println("Average Marks    :" + avrage);
            System.out.println("Total Passed     : " + passed);
            System.out.println("Total Failed     : " + failed);
            System.out.println("Youngest Student : " + "Name-" + youngstudent.Name + "Age-" + youngstudent.Age);
            System.out.println("Oldest Student   : " + "Name-" + olderstudent.Name + "Age-" + olderstudent.Age);
        }

    }
    static boolean isrollexit(StudentSystem[] students,int roll){
        boolean flag = false;
        for (int i = 0; i < index; i++) {
            if (students[i].rollNo == roll) {
                flag = true;
            }

        }
        return flag;
    }
}
class StudentSystem{
    int rollNo;
    String Name;
    int Age;
    float Marks;

    //No-argument constructor
    StudentSystem(){

        this(0,"Default",0,0);
    }

    // Parameterized constructor
    StudentSystem(int rollNo,String Name,int Age,float Marks){
        this.rollNo=rollNo;
        this.Name=Name;
        this.Age=Age;
        this.Marks=Marks;
    }

    // Copy constructor
    StudentSystem(StudentSystem other){
        this.rollNo=other.rollNo;
        this.Name=other.Name;
        this.Age=other.Age;
        this.Marks=other.Marks;
    }

    //changeName() v
    void changeName(String name ){

        this.Name=name;
    }
    // change Marks
    void changeMarks(float marks){

        this.Marks=marks;
    }
    //change age
    void changeAge(int age){

        this.Age=age;
    }
    //change roll number;
    void changeRollNo(int rollNo){

        this.rollNo=rollNo;
    }
    //Display Student Data;
    void displayStudent(){
        System.out.println("Roll no:"+this.rollNo+" Name:"+this.Name+" Age:"+this.Age+" marks:"+this.Marks);
    }
}
