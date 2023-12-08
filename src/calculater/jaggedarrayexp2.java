package calculater;

import java.util.Scanner;

public class jaggedarrayexp2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the number of games");
        int n=scan.nextInt ();
        int arr[][]=new int[n][];
        for(int i=0;i<= arr.length-1;i++){
            System.out.println ("enter the players"+i);
            int m= scan.nextInt ();
            arr[i]=new int[m];
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                System.out.println ("games"+i+"players"+j);
                arr[i][j]= scan.nextInt ();
            }
        }
        System.out.println ("score");
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<= arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
