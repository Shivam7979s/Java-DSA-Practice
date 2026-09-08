package Pattrn_Qustions;

public class Pattern {
    public static void main(String[] args) {
        // pattern1();
       pattern2();
        //   pattern3();
    //    pattern4();
    //    pattern5();
    //   pattern6();
    }
    static void pattern1(){                 
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        for(int i=1;i<=4;i++){              
            for(int j=1;j<=i;j++){          
                System.out.print("* ");  
            }
            System.out.println();
        }
    }
    static void pattern3(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern4(){
        int n=5;
        for(int i=1;i<=n;i++){              
            for(int j=1;j<=i;j++){          
                System.out.print(j+" ");  
            }
            System.out.println();
        }
    }
    static void pattern5(){
        int n=5;
        for(int i=1;i<=n;i++){              
            for(int j=1;j<=i;j++){          
                System.out.print("*");  
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6() {
        int n = 5;

            // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                }
                System.out.println();
        }
    }
}
