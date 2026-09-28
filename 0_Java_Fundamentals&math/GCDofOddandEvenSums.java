public class GCDofOddandEvenSums {
    public static void main(String[] args) {
        int n=4;
        int oddsum = 1;
        int odd=0;

        int evensum=2;
        int even=0;

        while( n>0){
            odd=odd+oddsum;
            oddsum = oddsum+2;

            even =even+evensum;
            evensum= evensum+2;
            n=n-1;
        }
        
        System.out.println(Math.abs(odd-even));
    }
    
}
