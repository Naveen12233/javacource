package calculater;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n= scan.nextInt ();
        revers rev=new revers ();
        int res= rev.reverseNumber (n);
        System.out.println (res);
    }
}

class revers{
    public int reverseNumber(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }

}