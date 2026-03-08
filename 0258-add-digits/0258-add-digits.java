class Solution {
    public int addDigits(int n) {
        int a=sum(n);
        while(a>=10){
            a=addDigits(a);
        }
        return a;
    }
    public int sum(int n){
        int s=0;
        while(n!=0){
            int d=n%10;
            s+=d;
            n/=10;
        }
        return s;
    }
}