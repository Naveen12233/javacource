package Strings;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String str1= scan.nextLine ();
        String str2= scan.nextLine ();
        lengthChecker checker=new lengthChecker ();
        boolean res=checker.checkLength (str1,str2);
        if(res==true){
            System.out.println ("string are same length");
        }else{
            System.out.println ("strings are different length");
        }
    }
}
