package datastructers;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the array length");
        int n= scan.nextInt ();

        int arr[]=new int[n];
        System.out.println ("enter "+arr.length+"elements");
        for(int i=0;i<=arr.length-1;i++ ){
            arr[i]= scan.nextInt ();
        }
        System.out.println("before sorting");
        for (int x:arr) {
            System.out.println(x+" ");
        }
        Bubblesort1 sort=new Bubblesort1 ();
        sort.sortArray(arr);
        System.out.println ("after sorting");
        for (int x:arr){
            System.out.println(x+" ");
        }
    }
}
