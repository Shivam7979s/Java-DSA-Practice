public class Maximum69Number {
    public static void main(String[] args) {
        int num=9669;
        System.out.println(maximum69Number(num));
    }
    static int maximum69Number (int num){
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev=rev*10+rem;
            num/=10;
        }
        int ans=0;
        int t=0;
        while(rev!=0){
            int rem = rev%10;
            if(rem==6 && t==0){
                ans= ans*10+9;
                t++;
            }
            else{
                 ans= ans*10+rem;
            }
            rev/=10;
        }

        return ans;
    }
    
}
