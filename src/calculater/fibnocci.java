package calculater;

import java.util.Scanner;

public class fibnocci {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();

        int fib1=0;
        int fib2=1;
        if(n==0){
            System.out.println (fib1);
        }
        else if(n==1){
            System.out.println (fib1+fib2);
        }else
        for(int i=1;i<=n;i++) {
            int fib3 = fib1 + fib2;
            System.out.println (fib1);
            fib1=fib2;
            fib2=fib3;

        }
    }
}
