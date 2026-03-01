class Solution {
    public int countDigits(int n) {
        int s=0;
        int p=n;
        while(n!=0){
            int d=n%10;
            if(p%d==0) s++;
            n/=10;
        }
        return s;
    }
}