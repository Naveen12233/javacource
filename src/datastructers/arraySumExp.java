package datastructers;

import java.util.Scanner;

public class arraySumExp {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();

        int arr[]=new int[n];
        System.out.println ("enter "+arr.length+"elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        Sumarray sum=new Sumarray ();
        int a=sum.findSum(arr);
        System.out.println (a);


    }
}
