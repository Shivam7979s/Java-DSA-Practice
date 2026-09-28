import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        multiple(2,2,3,4,54,5,6,67,7,5,4,3);
        Fun(3,5,7,6,4,4,5,5,6,7,8);
        
    }
    static void multiple(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void Fun(int a,int b, int ...c){
        System.out.println(Arrays.toString(c));
    }
    
}
