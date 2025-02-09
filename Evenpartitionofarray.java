import java.util.*;
class Evenpartitionofarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int sum1=0;
        int ans=0,cnt=0;
        for(int i=0;i<arr.length-1;i++){
            sum1=sum1+arr[i];
            int temp=sum1;
            int sum2=0;
            int j=arr.length-1;
            while(i<j){
                sum2=sum2+arr[j];
                j--;
            }
            if((sum1-sum2)%2==0){
                cnt++;
            }
            System.out.println("sum1: "+sum1+ "sum2: "+sum2 );
            sum1=temp;
        }
        System.out.print(cnt);
    }
}