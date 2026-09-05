public class AddDigits {
    public static void main(String[] args) {
        int n=38;
        System.out.println(add(n));

    }
    static int add(int n){
      
        while(n>=10){

            int digits=0;
            while (n>0) {
                int rem=n%10;
                digits+=rem;
                n=n/10;
            }
            n=digits;
         
        }
        return n;

    }
    
}
