//Sum of two elements with sum nearest to zero


class GFG
{
    public static int closestToZero (int arr[], int n)
    {
        // your code here
        int posmin=Integer.MAX_VALUE;
        int negmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    int temp=arr[i]+arr[j];
                    if(temp<=0){
                        if(temp>negmax)
                            negmax=temp;
                    }
                    if(temp>0){
                        if(temp<posmin)
                            posmin=temp;
                    }
                }
            }
        }
        if(negmax==Integer.MIN_VALUE)   return posmin;
        if(posmin==Integer.MAX_VALUE)   return negmax;
        if((0-negmax)<posmin)   return negmax;
        return posmin;
    }
    public static void main(String[] args){
        int arr[]={18,-1,0,0};
        int n=arr.length;
        int ans=closestToZero(arr,n);
        System.out.println(ans);
    }
}