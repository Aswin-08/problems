import java.util.*;
class Sort{
    public static void main(String args[]){
        int arr[]={3,4,5,7,9,1,2};//5,2,3,1,4
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]%2==0){
                        if(arr[i]>arr[j]){
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
            }
            else{
                if(arr[i]%2!=0){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[j]%2!=0){
                            if(arr[i]<arr[j]){
                                int temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}
