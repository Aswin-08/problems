import java.util.*;
class numberanagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean ans=check(n,m);
        if(ans) System.out.print("Yes");
        else    System.out.print("No");
    }
    public static boolean check(int n,int m){
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        valid(n,arr1);
        valid(m,arr2);
        for(int i=0;i<10;i++){
            if(arr1[i]!=arr2[i])    return false;
        }
        return true;
    }
    static void valid(int a,int[] arr){
        while(a>0){
            int num=a%10;
            arr[num]++;
            a/=10;
        }
    }
}