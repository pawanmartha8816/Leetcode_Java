class Solution {
    public int maxDistance(int[] ar) {
        int n=ar.length;
        int d=0,m=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]!=ar[j]){
                    d=Math.abs(i-j);
                }
                m=Math.max(d,m);
            }
        }
        return m;
    }
}