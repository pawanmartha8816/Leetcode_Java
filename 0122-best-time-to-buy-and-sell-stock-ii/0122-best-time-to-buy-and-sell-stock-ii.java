class Solution {
    public int maxProfit(int[] ar) {
        int n=ar.length;
        int s=0;
        int max=0;
        int i=0,j=i+1;
        while(j<n){
            int d=ar[j]-ar[i];
            if(d>0){
                s+=d;
            }
            i++;
            j++;
        }
        return s;
    }
}