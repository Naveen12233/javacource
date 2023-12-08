package patterns;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the length of an array");
        int n= scan.nextInt ();

        int arr[]=new int[n];
        System.out.println ("enter "+n+"of elements");
        for(int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt ();
        }
        System.out.println ("contents");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
