//Write a C program to calculate the sum of all integers from 5 to 50.


public class Sum {
    public static void main(String[] args) {
       

        int sum= 0;
        for(int i = 5; i<=50; i++){
            sum= sum+i;
        }
        
        System.out.println(sum);
    }
}
