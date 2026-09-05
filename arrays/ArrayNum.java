package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayNum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

      String[] name=new String[5];
      System.out.println("Enter names:");
      for(int i=0;i<name.length;i++){
        name[i]=in.next();

      }
      System.out.println(Arrays.toString(name));
        in.close();
    }
}
