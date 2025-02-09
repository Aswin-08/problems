//import java.util.*;
class Matrix_diagonal{
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        /* 
        int m=sc.nextInt();
        int arr1[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        */
        Matrix_diagonal ss=new Matrix_diagonal();
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        ss.diagonal(arr1);
    }
    public void diagonal(int[][] arr1){
        int a=0;
        int n=arr1.length,m=arr1.length;
        int res[]=new int[n*m];
       
            for(int i=n-1;i>0;i--){
                res[a]=arr1[m-1][i];
                a++;
            }
            
            for(int i=m-2;i>0;i--){
                res[a]=arr1[i][n-1];
                a++;
            }
            
            for(int i=m-1;i>=0;i--){
                for(int j=0;j<=n-1;j++){
                    if((i+j)==(n-1)){
                        res[a]=arr1[i][j];
                        a++;

                    }
                }
            }
            for(int i=m-2;i>0;i--){
                res[a]=arr1[i][0];
                a++;
            }
            for(int i=n-2;i>=0;i--){
                res[a]=arr1[0][i];
                a++;
            }

            //return res;
            for(int i=0;i<res.length;i++){
                System.out.print(res[i]+" ");
            }
        
    }
}