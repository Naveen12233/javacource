package datastructers;

public class selection {
    void selectionSort(int arr[]){
        int min;
        int position;
        int temp;
        for(int i=0;i<=arr.length-2;i++){
            min=arr[i];
            position=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<min){
                    min=arr[j];
                    position=j;
                }
            }
            //swaping
            temp=arr[i];
            arr[i]=arr[position];
            arr[position]=temp;
        }
        System.out.println ("after swaping");
        for(int x:arr){
            System.out.println (x);
        }
    }
}
