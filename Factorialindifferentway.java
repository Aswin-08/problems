import java.util.*;
class Factorialindifferentway{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int red=sc.nextInt();
        int blue=sc.nextInt();
        int ans=red+blue,cnt=1,i=1;
        while(i<ans)
        {
            ans=ans-i;
            i++;
            cnt++;
        }
        System.out.print(cnt);
    }
}