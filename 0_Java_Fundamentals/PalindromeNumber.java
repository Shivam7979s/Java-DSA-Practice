//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        
        long n=input.nextLong();
        input.close();

        Palindrome(n);
        
    }
    static void Palindrome(long n){
        long original= n;
        long reverse=0;
        for(;n>0;n=n/10){
            long rem=n%10;
            reverse=reverse*10+rem;

        }
        if(original==reverse){
            System.out.println("number is palindrome");

        }
        if(original!=reverse){
            System.out.println("Number is not palindrome");
        }
        
    }
    
}
