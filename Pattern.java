import java.util.*;
class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt(),num=1;
        //System.out.print();
        /*for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(num);
            }
            System.out.println("\t");
            num++;
        }*/
        int n = 4; // You can change this value for different inputs
        
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=n;j>i;j--){
                    System.out.print(" ");
                }
                for(int k=n;k>i;k--){
                    System.out.print(k);
                }
                System.out.println();
            }
        
    }
}