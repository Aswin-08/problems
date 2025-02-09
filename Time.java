import java.util.*;
class Time{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*int arr[]=new int[4];
        int i=3;
        while(i>=0){
            arr[i]=n%10;
            n/=10;
        }*/
        int a[]=check(n);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);

        }

    }
    public static int[] check(int n){
        int freq[]=new int[10];
        int arr[]=new int[4];
        int i=3;
        while(i>=0){
            ++freq[n%10];
            n/=10;
            i--;
        }
        i=0;
        for(int j=2;j>=0;j--){
            if(freq[j]>=1){
                arr[i]=j;
                --freq[j];
                //i++;
                break;
            }  
        }
        if(arr[0]==2){
            i=1;
            for(int j=3;j>=0;j--){
                if(freq[j]>=1){
                    arr[i]=j;
                    --freq[j];
                    //i++;
                    break;
                }  
            }
        }
        if(arr[0]==0||arr[0]==1){
            i=1;
            for(int j=9;j>=0;j--){
                if(freq[j]>=1){
                    arr[i]=j;
                    --freq[j];
                    //i++;
                    break;
                }  
            }
        }
        i=2;
        for(int j=5;j>=0;j--){
            if(freq[j]>=1){
                arr[i]=j;  
                --freq[j];
                //i++;
                break;
            }
        }
        i=3;
        for(int j=9;j>=0;j--){
            if(freq[j]>=1){
                arr[i]=j;  
                --freq[j];
                //i++;
                break;
            }
        }
        return arr;

    }
}