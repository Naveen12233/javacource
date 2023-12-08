package datastructers;

import java.util.Scanner;

public class twoArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt ();
        int arr1[]=new int[n];
        System.out.println ("enter"+arr1.length+"elements");
        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]= scan.nextInt ();
        }
        System.out.println ("array2");
        int arr2[]=new int[scan.nextInt ()];
        System.out.println ("enter "+arr2.length+"elements");
        for(int i=0;i<=arr2.length-1;i++){
            arr2[i]= scan.nextInt ();

        }

        System.out.println ("array1=====>");
        for(int x:arr1){
            System.out.println(x);
        }

        System.out.println ("array2=====>");
        for(int x:arr2){
            System.out.println (x);
        }

        //object creation

        SumTwoArray sumarray=new SumTwoArray ();
        int result[]=sumarray.TwoArray (arr1,arr2);
        System.out.println ("sum of two arrays");
        for(int x: result){
            System.out.println (x);
        }
    }
}
