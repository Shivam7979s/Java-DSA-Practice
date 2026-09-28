package Oop;

public class StudentData {
    public static void main(String[] args) {
//        Student[] students = new Student[5];

        Student shivam = new Student("Shivam Singh",1,88.5f,18);
        Student samir = new Student("Samir",2,99.5f,19);
        Student sunny = new Student("Sunny",3,98.3f,20);
        Student sahil = new Student("Sahil",4,98.5f,19);
        Student random = new Student();
        System.out.println(random.name);



    }
}
//create a student class
class Student {
    int rolls;
    String name;
    int age;
    float marks;

    // Prints a greeting using the current student's name.
    void greeting(){
        System.out.println("Hello! my name is " +this.name);
    }

    // Changes the name of the current Student object.
    void changeName(String name){
        this.name = name;
    }

    // Changes the roll number of the current Student object.
    void changeRolls(int rolls){
        this.rolls = rolls;
    }

    // Changes the marks of the current Student object.
    void changeMarks(float marks){
        this.marks = marks;
    }

    // Changes the age of the current Student object.
    void changeAge(int age){
        this.age = age;
    }

    // copy constructor
    Student (Student oter){
        this.rolls = oter.rolls;
        this.name = oter.name;
        this.age = oter.age;
        this.marks = oter.marks;
    }

    // parameterized constructor
    Student(String name , int rolls , float marks , int age){
        this.name = name;
        this.rolls = rolls;
        this.marks = marks;
        this.age = age;
    }
    // no-argument constructor
    Student(){
        this("Default Name",1,88.5f,18);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage finalized");
    }
}
//garbage collection example;
class Garbage{
    String name;
    public Garbage(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage finalized");
    }
}
