package datastructers;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();

        int arr[]=new int[n];
        System.out.println ("enter the"+arr.length+"elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        System.out.println ("enter the key to search");
        int key= scan.nextInt ();

        BinarySearch search=new BinarySearch ();
        int res=search.search(arr,key);
        System.out.println (res);
    }
}
