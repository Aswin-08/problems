import java.util.*;
class productofarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        check(arr,n);
        
    }
    public static void check(int[] arr,int n){
       /*  int left[]=new int[n];
        int right[]=new int[n];
        int res[]=new int[n];

        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=arr[i-1]*left[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=arr[i+1]*right[i+1];
        }

        for(int i=0;i<n;i++){
            res[i]=left[i]*right[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        */
        int pdt=1;
        for(int i=0;i<n;i++){
            pdt*=arr[i];
        }
        //for(int i=0;i<n;i++){
        //    arr[i]=pdt/arr[i];
        //}
        for(int i=0;i<n;i++){
            System.out.print(pdt/arr[i]+" ");
        }
    }

}