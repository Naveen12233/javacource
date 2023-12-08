import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();

        int arr[]=new int[n];
        System.out.println ("enter the"+arr.length+"elements");
        for(int i=0;i<= arr.length-1;i++){
            arr[i]= scan.nextInt ();
        }
        for(int x:arr){
            if(x>0){
                System.out.println (x);
            }
        }
    }
}
