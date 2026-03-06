class Solution {
    public int[] evenOddBit(int n) {
        int[] ar=new int[2];
        int c=0;
        while(n!=0){
            if((n&1)==1){
                if(c%2==0){
                    ar[0]++;
                }
                else if(c%2==1){
                    ar[1]++;
                }
            }
            c++;
            n=n>>1;
        }
        return ar;
    }
}