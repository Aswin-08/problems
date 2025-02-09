//import java.util.*;
class FirstTcsprogram{
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
        String str="Arun Prakash";
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')  cnt++;
        }
        if(cnt==0)  System.out.print("No lower case character");
        else    System.out.print(cnt);

    }
}