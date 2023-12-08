package pratice;

import java.util.Arrays;
import java.util.Locale;

public class AnagramString {
    boolean Anagram(String s1,String s2){
        s1=s1.toLowerCase ();
        s2=s2.toLowerCase();
        char arr1[]=s1.toCharArray ();
        char arr2[]=s2.toCharArray ();
        Arrays.sort (arr1);
        Arrays.sort (arr2);
        for(int i=0;i<=arr2.length-1;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }else {
                continue;
            }
        }
        return true;
    }
}
