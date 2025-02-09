//import java.util.*;
class movezerostoleft{
    public static void main(String[] args){
        int arr[]={0,1,0,10,9,0,0,2};
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[j--]=arr[i];
            }
        }
        while(j>=0){
            arr[j]=0;
            j--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}