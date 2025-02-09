import java.util.*;
class zohoset2q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter K Value");
        int k=sc.nextInt();
        zohoset2q1 zz=new zohoset2q1();
        System.out.print(zz.ischeck(arr,n,k));
    }
    public boolean ischeck(int[] arr,int n,int k){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    int temp=arr[i]+arr[j];
                    if(temp==k) return true;
                }
            }
        }
        return false;
    }
}