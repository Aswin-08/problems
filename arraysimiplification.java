import java.util.*;
public class arraysimiplification
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int arr[]={10,1112,222,333,444,56,22,49,81};
		int a[]=check(arr);
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
		//System.out.print();
	}
	public static int[] check(int arr[]){
	    ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
		    int n=arr[i];
		    while(n>0){
		        al.add(n%10);
		        n/=10;
		    }
		}
		int res[]=new int[al.size()];
		for(int i=0;i<al.size();i++){
		    res[i]=al.get(i);
		}
		int visited=-1;
		for(int i=0;i<res.length;i++){
		    for(int j=i+1;j<res.length;j++){
		        if(res[i]==res[j])  res[j]=visited;
		    }
		}
		int cnt=0;
		for(int i:res){
		    if(i!=-1){
		        cnt++;
		        //System.out.print(i+" ");
		    }   
		}
		//System.out.print(cnt);
		int k=0;
		int ans[]=new int[cnt];
		for(int i=0;i<res.length;i++){
		    if(res[i]!=-1){
		        ans[k++]=res[i];
		    }
		}
		return ans;
	}
}