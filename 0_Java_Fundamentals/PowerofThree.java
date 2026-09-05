public class PowerofThree {
    public static void main(String[] args) {
        int n=2117;
        System.out.println(power(n));

    }
    static boolean power(int n){
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
     
     return n==1;
    }
}
