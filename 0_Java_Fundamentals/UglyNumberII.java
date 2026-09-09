public class UglyNumberII {
    public static void main(String[] args) {
        int n = 1352;
        System.out.println(nthUglyNumber(n));

    }
    static int nthUglyNumber(int n){
        if ( n == 1 ) return n;
        int c = 1;
        int i = 2;
        int ans = 1;
        while (true){
            if ( isugly(i)){
                c++;
                if (c == n) break;
            }
            i++;

        }
        return i;
    }
    static boolean isugly(int n){
        while ( n != 1 ){
            if ( n % 2 == 0 ){
                n = n / 2;
            }
            else if ( n % 3 == 0 ){
                n = n / 3;
            }
            else if ( n % 5 == 0 ){
                n = n / 5;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
