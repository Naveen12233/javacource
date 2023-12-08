package pratice;

public class anagram {
    public static void main(String[] args) {
        String s1 = "RAM";
        String s2 = "MARE";
        if(s1.length ()==s2.length ()){
            AnagramString anagram=new AnagramString ();
            boolean res=anagram.Anagram(s1,s2);
            if(res==true){
                System.out.println ("string is anagram");
            }else{
                System.out.println ("not anagram");
            }

        }
        else{
            System.out.println (" anagram length are not equl");
        }
    }
}
