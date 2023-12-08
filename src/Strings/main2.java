package Strings;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String str= scan.nextLine ();
        ULcase ulcase=new ULcase ();
        ulcase.UpperLowerCase (str);
    }
}
