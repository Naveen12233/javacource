package Strings;

public class mutable {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder ("hello");
        System.out.println (sb1);
        sb1.append ("nithik");
        System.out.println (sb1);
        StringBuffer sb2=new StringBuffer ("naveen");
        System.out.println (sb2);

        sb2.append ("nampally");
        System.out.println (sb2);
    }
}
