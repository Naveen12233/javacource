package calculater;

import java.util.Scanner;

public class ArrayJagged {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[5];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println ("class "+i+"student"+j);
                arr[i][j]=scan.nextInt ();
            }
        }
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
