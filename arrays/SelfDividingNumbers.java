package arrays;

import java.util.ArrayList;
import java.util.List;

//L: 728
public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left  = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
    static List<Integer> selfDividingNumbers(int left, int right){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    static boolean isSelfDividing(int n){
        int temp = n;
        while (  temp != 0){
            int rem  = temp%10;
            if (rem == 0) return false;
            if (n % rem != 0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}
