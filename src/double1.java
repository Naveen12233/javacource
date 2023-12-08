import java.util.Scanner;

public class double1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt ();
        int res=doubleTheNumber (num);
        System.out.println (res);

    }
    public static  int doubleTheNumber(int num){
        return num*2;
    }
}
