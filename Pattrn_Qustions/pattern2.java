package Pattrn_Qustions;

public class pattern2 {
    public static void main(String[] args) {
        int n=4;
        pt(n);

    }
    static void pt(int n){

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}

