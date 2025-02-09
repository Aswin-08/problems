import java.util.*;
class Flames{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String copy1=str1,copy2=str2;
        if(str1.length()>str2.length()){
            String temp=str1;
            str1=str2;
            str2=temp;
        }
        sc.close();
        StringBuilder sb1=new StringBuilder(str1);
        
        StringBuilder sb2=new StringBuilder(str2);
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(sb1.charAt(i)==sb2.charAt(j)){
                    char a=str1.charAt(i);
                    char b=str2.charAt(j);
                    sb1=sb1.deleteCharAt(i);
                    sb2=sb2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        int num=sb1.length()+sb2.length();
        num%=6;
        switch(num){
            case 1:
                System.out.println(copy1+" and "+copy2+" are Friends");
                break;
            case 2:
                System.out.println(copy1+" and " + copy2+" are Lovers");
                break;
            case 3:
                System.out.println(copy1+" and " +copy2 +" are having Affection");
                break;
            case 4:
                System.out.print(copy1+" and "+copy2+" will going to be married");
                break;
            case 5:
                System.out.print(copy1+" and "+copy2+" are Enemies");
                break;
            case 0:
                System.out.print(copy1+" and "+copy2+" are Siblings");
                break;
        }

    }
}
