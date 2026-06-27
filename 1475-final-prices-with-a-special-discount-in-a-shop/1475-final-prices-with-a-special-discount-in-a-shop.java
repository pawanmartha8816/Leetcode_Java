class Solution {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<=arr[i]){
                    ans[i]=arr[i]-arr[j];
                    break;
                }
                else{
                    ans[i]=arr[i];
                }
                
                
            }
        }
        ans[n-1]=arr[n-1];
        return ans;
    }
}