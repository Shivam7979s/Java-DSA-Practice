package Recursion;

import java.util.ArrayList;
import java.util.Stack;

public class ss {
    static Stack<Integer> Subset=new Stack<>();
    public static void printSubSeq(int arr[],int s,int e){
        if(s==e){
            for(int i:Subset){
                System.out.print(i+" ");
            }
            System.out.println();
        }else{
            Subset.push(arr[s]);
            printSubSeq(arr,s+1,e);
            Subset.pop();
            printSubSeq(arr,s+1,e);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,55,4};
        printSubSeq(arr,0,arr.length-1);
    }
}