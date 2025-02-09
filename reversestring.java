import java.util.*;
class reversestring
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.next(),s="";
		for(int i=0;i<str.length();i++) if(str.charAt(i)>='A'&&str.charAt(i)<='Z')  s+=str.charAt(i);
		System.out.print(s);
		System.out.println();
	    int j=0;
	    for(int i=str.length()-1;i>=0;i--)  
		{
		    if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
		        str=swap(i,j,s,str);
		        j++;
		    }
		}
		System.out.print(str);
	}
	public static String swap(int i,int j,String s,String str){
	    StringBuilder sb=new StringBuilder(str);
	    //StringBuilder ab=new StringBuilder(s);
	    //char c=s.charAt(j);	    
	    sb.setCharAt(i,s.charAt(j));
	    return sb.toString();
	} 
}