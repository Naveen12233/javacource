package Strings;

public class uniCode {
    void unicodeString(String str){
        for(int i=0;i<=str.length ()-1;i++){
            int unicode=(int)str.charAt (i);
            System.out.println (unicode);
        }
    }
}
