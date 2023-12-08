import java.util.Scanner;

public class jaggedjexp {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the 2-D array length");
        int n= scan.nextInt ();
        String arr[][]=new String[n][];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println ("enter the 2nd length:");
            int m= scan.nextInt ();
            arr[i]=new String[m];
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println ("bank "+i+"customer namee"+j);
                arr[i][j]=scan.next ();
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
