package Strings;

public class example {
    public static void main(String[] args) {
        String s1="rama";
        String s2=" sita";
        String s3="rama"+"sita";
        String s4="rama"+"sita";
        if(s3==s4){
            System.out.println ("reference are equal");
        }
        else{
            System.out.println ("reference are not equal");
        }
        if(s4.equals (s3)){
            System.out.println ("string are equal");
        }else{
            System.out.println ("string are not equal");
        }
    }
}
