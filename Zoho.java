import java.util.*;
class Zoho{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        check(arr,n);
        //sc.close();
        //System.out.println(check(arr,n));
    }
    public static void check(int[] arr,int n){
        int res[]=new int[n];
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]&&arr[j]<temp){
                    temp=arr[j];
                }
                
            }
            res[i]=temp;
            if(temp==Integer.MAX_VALUE) res[i]=-1;
            temp=Integer.MAX_VALUE;
            
        }
        //return res;
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}