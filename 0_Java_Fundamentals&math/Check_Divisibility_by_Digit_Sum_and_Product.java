

public class Check_Divisibility_by_Digit_Sum_and_Product {
    public static void main(String[] args) {
        int n=23;
        System.out.println(checkDivisibility(n));
    }
    static boolean checkDivisibility(int n){

        int sum =0;
        int prod=1;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            sum +=rem;
            prod *=rem;
            temp/=10;

        }
     
        return n%(sum+prod)==0;

    
    }
    
}
