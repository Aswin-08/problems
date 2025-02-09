/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class sortarraybasedonfrequency
{
	public static void main(String[] args) {
	    sortarraybasedonfrequency m=new sortarraybasedonfrequency();
		Scanner sc=new Scanner(System.in);
		int arr[]={5,11,10,20,9,16,23};
		int freq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
		    freq[i]=fact(arr[i]);
		    //num;
		}
	
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]+" "+freq[i]);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        int temp1=0,temp2=0;
		        if(freq[i]<freq[j]){
		            
		            temp1=freq[i];
		            freq[i]=freq[j];
		            freq[j]=temp1;
		            
		            
		            temp2=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp2;
		        }
		    }
		}
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
	public static int fact(int n){
	    int cnt=0;
	    for(int i=1;i<=n;i++){
	        if((n%i)==0)    cnt++;
	    }
	    return cnt;
	}
}