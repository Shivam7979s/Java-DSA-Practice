//Write a java program to print all odd numbers from 5 to 50 using a for loop and continue statement


public class OddNumbers {
    public static void main(String[] args) {
        
    
    for(int i=5; i<=50; i++){
        if(i%2==0){
            continue;
        }
        System.out.println(i);

    }


}
    
}
