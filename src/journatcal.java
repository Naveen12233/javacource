import java.util.Scanner;

public class journatcal {
    public static void main(String[] args) {
        System.out.println ("enter employees");
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();

        boolean arr[]=new boolean[n];

        System.out.println ("enter employee ");
        for(int i=0;i<= arr.length-1;i++){
            System.out.println ("is person" +i+ "married?");
           arr[i]= scan.nextBoolean ();
        }
        System.out.println ("array contents are");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println ("person"+i+"married"+arr[i]);
        }

    }
    }
