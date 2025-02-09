import java.util.*;
class Twosum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        if(ischeck(arr,n,target)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    public static boolean ischeck(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            int j=n-1;
            while(i<j){
                ///System.out.println(arr[i]+arr[j]);
                if(arr[i]+arr[j]==target){
                    return true;
                }
                j--;

            }
        }
        return false;
    }
}