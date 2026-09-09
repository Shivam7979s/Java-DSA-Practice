package arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));

    }
    static int distributeCandies(int[] candyType){
        int n =  candyType.length;
        int can = n / 2;
        int type = 1;
        for (int i = 1; i < n; i++) {
            if ( candyType[i-1] != candyType[i]){
                type++;
            }
        }
        return Math.min(can, type);
    }
}
