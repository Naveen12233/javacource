package calculater;

import java.util.Scanner;

public class printNmber {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the number greater than 100");
        int n= scan.nextInt ();
        for(int i=2;i<=n;i++) {
           int res= printNumber (i);
           if(res!=0){
               System.out.println (res);
           }
        }

    }
    public static int printNumber(int n){
        for(int i=2;i<n;i++){
            if(n%i ==0){
                return 0;
            }
            }
        return n;
    }

}
