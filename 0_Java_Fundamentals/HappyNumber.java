

public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        System.out.println(number(n));

    }
    static boolean number(int n){

        int sum1=n;
        while( sum1>0){
            int sum=0;
            while(n >0){
            int rem= n%10;
            n=n/10;
            sum+=rem*rem;
            }
            if(sum1==1){
                return true;
            }
        }

        //incomplete


       


        return false;
    }
}
