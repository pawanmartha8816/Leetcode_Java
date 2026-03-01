class Solution {
    public int xorOperation(int n, int s) {
        int x=0;
        for(int i=s;i<s+2*n;i=i+2){
            x^=i;
        }
        return x;

    }
}