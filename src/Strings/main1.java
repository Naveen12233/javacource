package Strings;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the character");
        String str= scan.nextLine ();
        uniCode uni=new uniCode ();
        uni.unicodeString (str);
    }
}
