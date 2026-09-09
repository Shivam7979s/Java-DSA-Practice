

public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n){
        while( n !=1 && n !=4){

            int temp = n;
            int sum = 0;
            while(temp != 0){
                int rem = temp%10;
                temp = temp/10;
                sum += square(rem);

            }
            n = sum;

        }
        return n==1;

    }
    static int square (int n){
        return n*n;
    }
}
