import java.util.*;
class encode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        String str=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            String temp="";
            for(int j=i;j<str.length();j++){
                //if(i!=j){             
                    temp=temp+str.charAt(j);
                    System.out.println(temp);
                    if(ischeck(temp)){
                        cnt++;
                    }
                    
                //}
            }
        
        }
        if(cnt==0){
            
            System.out.print("0");
        }
        else{
            System.out.print(cnt);
        }
    }
    public static boolean ischeck(String temp){
        //char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int n=Integer.parseInt(temp);
        for(int i=0;i<num.length;i++){
            if(num[i]==n){
                return true;
            }
        }
        return false;
    }
}