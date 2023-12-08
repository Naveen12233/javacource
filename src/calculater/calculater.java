package calculater;

import java.util.Scanner;

public class calculater {
    Scanner scan =new Scanner (System.in);


    void addition() {
        System.out.println ("enter two numbers");
        int a= scan.nextInt ();
        int b= scan.nextInt ();
        System.out.println ("addition of "+a+"+"+b+"="+(a+b));


    }
    void substraction(){
        System.out.println ("enter two numbers");
        int a= scan.nextInt ();
        int b= scan.nextInt ();
        System.out.println ("substraction of "+a+"-"+b+"="+(a-b));

    }
    void multiplication(){
        System.out.println ("enter two numbers");
        int a= scan.nextInt ();
        int b= scan.nextInt ();
        System.out.println ("multiplication of "+a+"*"+b+"="+(a*b));

    }
    void division(){
        System.out.println ("enter two numbers");
        int a= scan.nextInt ();
        int b= scan.nextInt ();
        System.out.println ("division of "+a+"/"+b+"="+(a/b));

    }
    void findRemainder(){
        System.out.println ("remainder");
        int a= scan.nextInt ();
        int b= scan.nextInt ();
        System.out.println ("remainder ="+(a%b));
    }
    void findsquare(){
        System.out.println ("enter a number");
        int a= scan.nextInt ();
        System.out.println ("square of"+(a*a));
    }
}

