package datastructers;

import java.util.Scanner;

public class MergeApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();
        int arr1[]=new int[n];
        System.out.println ("enter the"+arr1.length+"elements");
        for(int i=0;i<= arr1.length-1;i++){
            arr1[i]= scan.nextInt ();
        }
        System.out.println ("array2");
        int arr2[]=new int[scan.nextInt ()];
        System.out.println ("enter the "+arr2.length+"elements");
        for(int i=0;i<=arr2.length-1;i++){
            arr2[i]= scan.nextInt ();
        }
        System.out.println ("array1======>");
        for(int x:arr1){
            System.out.println (x);
        }
        System.out.println ("array2========>");
        for(int y:arr2){
            System.out.println (y);
        }
        MergeArray merge=new MergeArray ();
        int res []=merge.mergeArray(arr1,arr2);
        System.out.println ("array3=====>");
        for(int x:res){
            System.out.print (x+" ");
        }

    }
}
