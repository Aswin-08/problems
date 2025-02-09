import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
		    if(isPrime(i)){
		        System.out.print(i+" ");
		    }
		}
	}
	public static boolean isPrime(int n){
	    if(n<=1)    return false;
	    
	    for(int i=2;i<n;i++){
	        if(n%i==0)  return false;
	    }
	    return true;
	}
}