package Strings;

public class demo {
    public static void main(String[] args) {
        String s1="rama";
        String s2="rama";
        if(s1==s2){
            System.out.println ("reference variable are equal");
        }else{
            System.out.println ("reference are not equal");
        }
        if(s2.equals (s1)){
            System.out.println ("string are equal");
        }else{
            System.out.println ("string are not equal");
        }
    }
}
