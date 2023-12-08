package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String s1= scan.next ();

        char arr1[]=s1.toCharArray ();
        char arr2[]=new char[arr1.length];

        int j=arr2.length-1;
        for(int i=0;i<=arr2.length-1;i++){
            arr2[j]=arr1[i];
            j--;
        }
        String s2=new String (arr2);
        if(s1.equalsIgnoreCase (s2)){
            System.out.println ("palindrome");
        }
        else{
            System.out.println ("not a palindrome");
        }
    }
}
