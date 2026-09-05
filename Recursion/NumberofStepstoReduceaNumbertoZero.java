package Recursion;

public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
      
        System.out.println(reduce1(8, 0));
        System.out.println(reduce2(14));
        
    }
    static int reduce1(int n,int count){
       
        if(n==0){
          
            return count;
        }
        if(n%2==0){
           return reduce1(n/2,count+1);   //method 1 to solve that Question;
        }
        else {
            return reduce1(n-1,count+1);
        }
      
    }
    static int reduce2(int n){
        int count=0;
        while(n!=0){
            if(n%2==0){
                n/=2;
                count++;                   //method 2 to solve that Question, this is fastest one;
            }
            else{
                n--;
                count++;
            }
        }
        return count;
    }
    
}
