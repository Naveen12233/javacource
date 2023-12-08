package Strings;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String s1= scan.next ();
        char arr1[] = s1.toCharArray();


        char arr2[]=new char[s1.length ()];
        int j=arr2.length-1;
        for(int i=0;i<=arr2.length-1;i++){
            arr2[j]=arr1[i];
            j--;
        }
        s1=new String (arr2);
        System.out.println ("after reverse");
        System.out.println (s1);

    }
}
