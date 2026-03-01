class Solution {
    public int[] countBits(int n) {
        int[] ar=new int[n+1];
        for(int i=0;i<=n;i++){
            int d=i;
            int in=i;
            int c=0;
            while(in!=0){
                c++;
                in=in&(in-1);
            }
            ar[d]=c;
        }
        return ar;
    }
}