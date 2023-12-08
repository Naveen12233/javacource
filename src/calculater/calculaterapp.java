package calculater;

import java.util.Scanner;

public class calculaterapp {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        calculater calculater=new calculater ();
        System.out.println ("welcome back");

while (true) {
    System.out.println ("+========> addition");
    System.out.println ("-========> substraction");
    System.out.println ("*=======> multiplication");
    System.out.println ("/=======> division");
    System.out.println ("%=====> remainder");
    System.out.println ("^======>square");

    char ch = scan.next ().charAt (0);

    switch (ch) {
        case '+':
            calculater.addition ();
            break;
        case '-':
            calculater.substraction ();
            break;
        case '*':
            calculater.multiplication ();
            break;
        case '/':
            calculater.division ();
            break;
        case '%':
            calculater.findRemainder ();
            break;
        case '^':
            calculater.findsquare ();
            break;
        default:
            System.out.println ("enter the correct one");

    }
}
    }
}
