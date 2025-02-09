import java.util.*;
class firstprog{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        if(n%2==0){
            int arr1[]=new int[n/2];
            int j=0;
            for(int i=0;i<n;i+=2){
                arr1[j]=arr[i]+arr[i+1];
                j++;
            }
            for(int i=0;i<n/2;i++){
                System.out.print(arr1[i]+" ");
            }

        }
            else{
                int arr2[]=new int[n/2];
                int j=0;
                for(int i=0;i<n-1;i+=2){
                    arr2[j]=arr[i]+arr[i+1];
                    j++;
                }
                for(int i=0;i<n/2;i++){
                    System.out.print(arr2[i]+" ");
                }
                System.out.print(arr[n-1]);
            }
    }
}