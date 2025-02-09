import java.util.*;
class thirdprog{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        //System.out.print(cnt);
        int arr[]=new int[cnt];
        for(int i=0;i<cnt;i++){
            arr[i]=copy%10;
            copy=copy/10;
        }
        for(int i=0;i<cnt;i++){
            System.out.print(arr[i]+" ");
        }
        
        if(arr.length%2==0){
            int sum1=0,sum2=0;
            int mid=cnt/2;
            for(int i=0;i<mid;i++){
                sum1+=arr[i];
            }
            for(int i=mid;i<cnt;i++){
                sum2+=arr[i];
            }
            System.out.print(sum1+" "+sum2);
            if(sum1==sum2)  System.out.print("Equal");
            else    System.out.print("Not Equal");
        }
        else{
            int sum1=0,sum2=0;
            int mid=cnt/2;
            for(int i=0;i<mid;i++){
                sum1+=arr[i];
            }
            for(int i=mid+1;i<cnt;i++){
                sum2+=arr[i];
            }
            
            System.out.print(sum1+" "+sum2);
            if(sum1==sum2)  System.out.print("Equal");
            else    System.out.print("Not Equal");
        }
    }
}