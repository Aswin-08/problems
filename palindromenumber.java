/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class palindromenumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPalindrome(num))    System.out.print("Yes");
		else    System.out.print("No");
	}
	public static boolean isPalindrome(int num){
		int copy=num;
	    int n=0;
	    while(num>0){
	        n=(n*10)+(num%10);
	        num/=10;
	    }
	    System.out.print(n);
	    return copy==n;
	}
}