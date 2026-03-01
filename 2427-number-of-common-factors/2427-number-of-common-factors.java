class Solution {
    public int commonFactors(int a, int b) {
        int c=a>b?a:b;
        int d=a<b?a:b;
        int s=0;
        for(int i=1;i<=c;i++){
            if(c%i==0){
                if(d%i==0){
                    s++;
                }
            }
        }
        return s;
    }
}