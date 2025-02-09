import java.util.Scanner;
import java.util.Arrays;
class lowestminimum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(ischeck(arr,n));
    }
    public static int ischeck(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]>=0&&arr[i+1]!=arr[i]+1)   return arr[i]+1;
        }
        return arr[n-1]+1;
    }
}