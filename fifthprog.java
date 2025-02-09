import java.util.*;
class fifthprog{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr1[]={9,8,7,6,5};
        int arr2[]={1,2,3,4};
        int res[]=new int[Math.max(arr1.length,arr2.length)];
        int i=arr1.length-1,j=arr2.length-1,k=res.length-1,carry=0;
        while(i>=0||j>=0||carry>0){
            int dig1=i>=0?arr1[i]:0;
            int dig2=j>=0?arr2[j]:0;
            int sum=dig1+dig2+carry;
            res[k]=sum%10;
            carry=sum/10;
            i--;j--;k--;
        }
        for(int a=0;a<res.length;a++){
            System.out.print(res[a]+" ");
        }
    }
}