import java.util.*;
class forthprog{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(check(n1,n2))    System.out.print("Yes");
        else    System.out.print("No");
        
    }
    public static boolean check(int n1,int n2){

        int freq1[]=new int[10];
        int freq2[]=new int[10];
        
        while(n1>0){
            ++freq1[n1%10];
            n1/=10;
        }
        while(n2>0){
            ++freq2[n2%10];
            n2/=10;   
        }
        for(int i=0;i<10;i++){
            if(freq1[i]!=freq2[i])  return false;
        }
        return true;
    }
}