package datastructers;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the length of number");
        int n= scan.nextInt ();
        int arr[]=new int[n];
        System.out.println ("enter"+arr.length+"elements");
        for(int i=0;i<= arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        System.out.println ("enter the key to search");
        int key= scan.nextInt ();

        //object
        linear search=new linear ();
        int res=search.linearSearch (arr,key);
        System.out.println (res);
    }
}
