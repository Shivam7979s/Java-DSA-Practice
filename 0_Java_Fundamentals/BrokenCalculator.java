public class BrokenCalculator {
    public static void main(String[] args) {
        int startValue = 5;
        int target = 8;
        System.out.println(brokenCalc(startValue, target));
    }
    static int brokenCalc(int startValue, int target){
        int c = 0;
        while(target > startValue){
            if(target % 2 == 0){
                target /= 2;
            }
            else{
                target +=1;
            }
            c++;
        }
        return c+(startValue - target);
    }
}
