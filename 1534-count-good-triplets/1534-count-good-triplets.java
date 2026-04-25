class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt=0;
        int n=arr.length;
        boolean x=false;
        boolean y=false;
        boolean z=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    x=Math.abs(arr[i]-arr[j])<=a;
                    y=Math.abs(arr[k]-arr[j])<=b;
                    z=Math.abs(arr[i]-arr[k])<=c;
                    if(x && y && z){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}