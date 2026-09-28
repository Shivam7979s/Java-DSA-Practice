import java.util.ArrayList;

public class primenumberQ {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(isprime(i)){
                list.add(i);
            }
        }
        System.out.println(list);

    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }

        int c=2;
        while(c * c <=n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    
}
