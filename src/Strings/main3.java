package Strings;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String str= scan.nextLine ();
        RevString reverse=new RevString ();
        String res=reverse.ReverseArray(str);
        System.out.println (res);

    }
}
