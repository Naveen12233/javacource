package datastructers;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();
        int arr[]=new int[n];
        System.out.println ("enter"+arr.length);
        for(int i=0;i<=arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }

        System.out.println ("array");
        for(int x:arr){
            System.out.println (x);
        }

        Exp1Sum sum=new Exp1Sum ();
        int result=sum.findSum(arr);
        System.out.println ("sum"+result);
    }
}
