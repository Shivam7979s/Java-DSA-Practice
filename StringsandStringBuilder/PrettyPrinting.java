package StringsandStringBuilder;
//PrettyPrinting
public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 3.77383f;
        System.out.printf("value of num is: %.3f",num);
        System.out.println();
        System.out.printf("value of PI is: %2f",Math.PI);      //main function ;
        String name = "Shivam";
        String surname = "Singh";
        String domin = "Java Developer";
        System.out.println();
        System.out.printf("Hello my name is %s %s and i am %s" , name,surname , domin);
    }
}
