package calculater;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();
        palindrom palin = new palindrom ();
        int res = palin.palindromeNumber (n);
        System.out.println (res);
        if(n==res){
            System.out.println ("palindrome");
        }else{
            System.out.println ("not palindrome");
        }
    }
}
class palindrom{
    public int palindromeNumber(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
}
