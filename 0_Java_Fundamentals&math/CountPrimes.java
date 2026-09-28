public class CountPrimes {
    public static void main(String[] args) {
        int n=2;
        System.out.println(count(n));
        

    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        long c=2;
        while(c * c <=n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        // System.out.println(c);
        return true;
    }
    static int count(int n){
        int count =0;
        for(int i=2;i<n;i++){
            if(isprime(i)){
                count++;
            }
        }
        return count;
    }
    
}
