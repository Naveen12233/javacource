package calculater;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(rem*3)+sum;
            n=n/10;
        }
        System.out.println (sum);
    }
}
