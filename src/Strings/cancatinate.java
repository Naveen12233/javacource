package Strings;

import java.util.Scanner;

public class cancatinate {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String str1=scan.nextLine ();
        String str2= scan.nextLine ();
        cancatinatesame cancat=new cancatinatesame ();
        String res=cancat.cancatinationChar (str1,str2);
        if(res!=null){
            System.out.println (res);
        }else{
            System.out.println ("cancatnation not possible");
        }
    }
}
