package arrays;

public class Concatenate_Non_Zero_Digits_and_Multiply_bySum_II {
    public static void main(String[] args) {
        String s="10203004";
        int[][] querie={
            {0,7},
            {1,3},
            {4,6}
        };
        int a=Integer.parseInt(s);

        int b=0;
        while(a!=0){
            int rem=a%10;
            if(rem!=0){
                b=b*10+rem;
            }
            a=a/10;
        }

        int temp=b;
        b=0;
        int sum=0;
        
        while(temp!=0){
            int rem=temp%10;
            if(rem!=0){
                sum=sum+rem;
                b=b*10+rem;
            }
            temp=temp/10;
        }
        b=b*sum;
        System.out.println(b);
    }
    
}
