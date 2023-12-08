package calculater;

import java.util.Scanner;

public class digitSum {
    public int digitSum(int n){
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}

class digit{
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int n= scan.nextInt ();
        digitSum sum=new digitSum ();
        int res=sum.digitSum (n);
        System.out.println (res);
    }
}
