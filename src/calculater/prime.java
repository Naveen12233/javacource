package calculater;


public class prime {
    public static void main(String[] args){
        int n= 6;
        int c=0;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                System.out.println ("not prime");
            }
        }
            if(c==2){
                System.out.println ("prime");
            }else{
                System.out.println ("not prime");
            }

    }
}
