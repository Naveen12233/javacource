package pratice;

public class main1 {
    public static void main(String[] args) {
        String str="malayalam";
        char arr[]=str.toCharArray ();
        for(int i=0;i<=arr.length-1;i++){
            int count=1;
            if(arr[i]!=' '){
                for(int j=i+1;j<= arr.length-1;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=' ';
                    }
                }
                System.out.println (arr[i]+"=====>"+count);
            }
        }
    }
}
