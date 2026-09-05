package arrays;

public class SumMultiples {
    public static void main(String[] args){

        int n=10;
        System.out.println(multiple(n));
    }
    static int multiple(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
    
}
