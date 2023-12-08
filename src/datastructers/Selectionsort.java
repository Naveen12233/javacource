package datastructers;

import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();
        int arr[]=new int[n];
        System.out.println ("enter the"+arr.length+"elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        System.out.println ("before sorting");
        for(int x:arr){
            System.out.println (x);
        }

        //object creation

        selection sort=new selection ();
         sort.selectionSort (arr);
    }
}
