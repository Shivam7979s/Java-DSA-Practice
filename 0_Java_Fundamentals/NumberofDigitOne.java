public class NumberofDigitOne {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countDigits(n)  );
    }
    static int countDigits(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            int temp = i;
            while(temp != 0){
                int rem = temp % 10;
                if(rem == 1){
                    count++;
                }
                temp /= 10;
            }
        }
        return count;
    }
}
