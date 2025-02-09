import java.util.*;
class secondprog{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(check(arr,m,n));
    }
    public static List<List<Integer>>  check(int[][] arr,int m,int n){
        List<List<Integer>> al1=new ArrayList<List<Integer>>();
        for(int i=0;i<m;i++){
            List<Integer> al2=new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                al2.add(arr[i][j]);
            }
            if(!al1.contains(al2)){
                al1.add(al2);
            }
        }
        return al1;
    }
}