package Strings;

public class RevString {
    String ReverseArray(String str){
        char arr[]=str.toCharArray ();
        char revarr[]=new char[str.length ()];

        //copy the spaces first

        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]==' '){
                revarr[i]=arr[i];
            }
        }
        //reverse the charcter array
        int j=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=' '){
                if(revarr[j]==' ')
                {
                   j--;
                }
                revarr[j]=arr[i];
                j--;
            }
        }
        str=new String (revarr);
        return  str;
    }
}
