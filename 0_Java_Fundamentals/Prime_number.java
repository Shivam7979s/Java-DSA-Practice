

public class Prime_number {
    public static void main(String[] args) {
        int n=5;
        System.out.println(prime(n));

        // for(int i=1;i<=20;i++){
        //     System.out.println(i + " "+ prime(i));
        // }
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
       int c=2;
       while(c*c <=n){
        if(n%c==0){
            return false;
        }
        else{
            c++;
        }
       }
       System.out.println(c);
 
       return true;
    }
    
}
