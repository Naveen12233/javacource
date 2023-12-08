
//coping array in the first array into second array
package datastructers;

import java.util.Scanner;

public class copyArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();

        int arr1[]=new int[n];

        System.out.println ("enter the length of array"+arr1.length);
        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]= scan.nextInt ();
        }
        //logic of coping an array
        int arr2[]=new int[arr1.length];
        for(int i=0;i<=arr1.length-1;i++){
            arr2[i]=arr1[i];
        }
        System.out.println ("contents of first array");
        for(int x:arr1){
            System.out.println (x);
        }
        System.out.println ("contents of second array");
        for(int y:arr2){
            System.out.println (y);
        }

    }
}
