
public class Amazonone
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String str="abbavh",s="",ans1="",ans2="";
		int k=2;
		for(int i=0;i<str.length();i++){
		    s="";
		    for(int j=i;j<str.length();j++){
		        s=s+str.charAt(j);
		        if(s.length()==k){
		            ans1=s;
		        }
		        if(s.length()>k){
		            String a=check(s,k);
		            if(a.length()>ans2.length()){
		                ans2=a;
		            }
		        }
		        
		    }
		}
		if(ans2.length()>k){
		    System.out.print(ans2);
		}
		else{
		    System.out.print(ans1);
		}
	}
	public static String check(String str,int k){
	    char c=str.charAt(0);
	    String s="";
	    s=s+str.charAt(0);
	    s=s+str.charAt(1);
	    for(int i=2;i<str.length();i++){
	        String x="";
	        x=x+str.charAt(i);
	        if(s.contains(x)){
	            s=s+x;
	            continue;
	        }
	        else{
	            s="";
	        s=s+str.charAt(0);
	        s=s+str.charAt(1);
	            break;
	        }
	    }
	    return s;
	}
}