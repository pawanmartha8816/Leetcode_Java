class Solution {
    public int[] recoverOrder(int[] ar1, int[] ar2) {
        int n=ar1.length;
        int m=ar2.length;
        int in=0;
        int[] ar=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ar1[i]==ar2[j]){
                    ar[in++]=ar1[i];
                    break;
                }
            }
        }
        return ar;
    }
}