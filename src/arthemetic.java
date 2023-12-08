public class arthemetic {
    public static void main(String[] args) {
        int r1=subtractNumber (20,5);
        int r2=multiplyNumber (4,5);
        double r3=divideNumber (20,4);
        int r4=findRemainder (10,3);
        System.out.println (r1);
        System.out.println (r2);
        System.out.println (r3);
        System.out.println (r4);;
    }
    public static int subtractNumber(int num1,int num2){
        return num1-num2;
    }
    public static int multiplyNumber(int num1,int num2){
        return num1*num2;
    }
    public static double divideNumber(int num1,int num2){
        return num1/num2;
    }
    public static int findRemainder(int num1,int num2){
        return num1%num2;
    }

}
