public class Smallest_Divisible_Digit_Product_I {
    public static void main(String[] args) {
        long n=11111;
        long t=26;
        System.out.println(smallestNumber(n, t));

    }
    static long smallestNumber(long n, long t){

        while(true){
            long p=1;
            long temp=n;
            while(temp!=0){
                long rem=temp%10;
                p=p*rem;
                temp/=10;
            }
            if(p%t==0){
                return n;
            }
            n++;
        }
    }
}
