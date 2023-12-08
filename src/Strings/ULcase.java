package Strings;

public class ULcase {
    void UpperLowerCase(String str){
        int LowerCount=0;
        int UpperCount=0;
        for(int i=0;i<=str.length ()-1;i++){
            if(Character.isLowerCase (str.charAt (i))){
                LowerCount++;

            }else{
                UpperCount++;
            }
        }
        System.out.println ("lower case count"+LowerCount);
        System.out.println ("upper case count"+UpperCount);
    }
}
