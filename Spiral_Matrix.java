import java.util.*;
class Spiral_Matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        //System.out.print(sprial(n));
        
        int arr[][]=sprial(n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static int[][] sprial(int n,int m){
        int num=1;
        int r=0,c=0;
        //int m=n;
        int arr[][]=new int[n][m];
        while(r<n&&c<m){
            for(int i=c;i<m;i++){
                arr[r][i]=num++;
            }
            r++;
            for(int i=r;i<n;i++){
                arr[i][m-1]=num++;
            }
            m--;
            if(r<n){

                for(int i=m-1;i>=c;i--){
                    arr[m][i]=num++;
                }
                n--;
            }
            if(c<m){

                for(int i=n-1;i>=r;i--){
                    arr[i][c]=num++;
                }
                c++;
            } 
        }
        return arr;
        /* 
        int cnt=1;
        for(int i=0;i<=n+2;i++){
            cnt++;
            if(cnt==n*n)    break;
            for(int j=0;j<=m+2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
            */
    }
}
/* 
import java.util.*;
class Spiral_Matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        
        int arr[][]=sprial(n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] sprial(int n,int m){
        int num=1;
        int r=0,c=0;
        //int m=n;
        int arr[][]=new int[n][m];
        while(r<n&&c<m){
            for(int i=c;i<m;i++){
                arr[r][i]=num++;
            }
            r++;
            for(int i=r;i<n;i++){
                arr[i][m-1]=num++;
            }
            m--;
            if(r<n){
                for(int i=m-1;i>=c;i--){
                    arr[m][i]=num++;
                }
                n--;
            }
            if(c<m){
                for(int i=n-1;i>=r;i--){
                    arr[i][c]=num++;
                }
                c++;
            } 
        }
        return arr;
    }
}
*/
