class Solution {
    public int countEven(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            int s=sum(i);
            if(s%2==0){
                c++;
            }
        }
        return c;
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