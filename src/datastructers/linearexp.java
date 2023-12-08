package datastructers;

import java.util.Scanner;

public class linearexp {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the length");
        int n= scan.nextInt ();
        int arr[]=new int[n];
        System.out.println ("enter"+arr.length+"elements");
        for(int i=0;i<= arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        System.out.println ("enter the key to search");
        int key= scan.nextInt ();

        search search=new search ();
        boolean res=search.isPresent(arr,key);
        if(res==true){
            System.out.println ("target found in aarray");

        }
        else{
            System.out.println ("taget not found");
        }
    }
}
