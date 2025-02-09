//import java.util.Arrays;
public class Uruttu
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	String str="devadharshini";
	int n=str.length();
	int cnt[]=new int[n];
	//Arrays.fill(cnt,1);
	char ch='\0';
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
			if(i!=j){

				if(str.charAt(i)==str.charAt(j)){
					cnt[i]++;
				}
	        }
	    }
	    
	}
	int max=cnt[0];
	ch=str.charAt(0);
	for(int i=0;i<n;i++){
	    if(max<cnt[i]){
	        max=cnt[i];
	        ch=str.charAt(i);
			//System.out.println(ch);
	    }
	}
	//max+=1;
	System.out.print((max+1)+" "+ch);
	}
}