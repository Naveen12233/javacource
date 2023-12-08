package pratice;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String str= scan.nextLine ();

        for(int i=0;i<=str.length ()-1;i++ ){
            String temp=" ";
            for(int j=i;j<=str.length ()-1;j++){
                temp=temp+str.charAt (j);
                System.out.println (temp);
            }
            System.out.println ();
        }
    }
}
