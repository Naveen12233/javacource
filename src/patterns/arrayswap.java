package patterns;

import java.util.Scanner;

public class arrayswap {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();
        int arr[]=new int[n];
        for(int i=0;i<= arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        System.out.println ("before swaping");
        for(int x:arr){
            System.out.println (x);
        }
        System.out.println ("enter two indexs to swap");
        int a= scan.nextInt ();
        int b= scan.nextInt ();
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println ("after swaping");
        for(int x:arr){
            System.out.println (x);
        }





    }
}
