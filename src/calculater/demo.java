package calculater;

import java.util.Scanner;

public class demo {
    int findGDP(int m,int n) {
        while (n != 0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }
}

class GDP {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter two numbers");
        int m= scan.nextInt ();
        int n= scan.nextInt ();

        demo gdp=new demo ();
        int res=gdp.findGDP (m,n);
        System.out.println (res);

    }
}
