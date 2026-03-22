class Solution {
    public boolean isUgly(int n) {
    if(n==0) return false;
    boolean f=false;
    while(n!=0){
        if(n%2==0){
            n/=2;
            f=true;
        }
        else if(n%3==0){
            n/=3;
            f=true;
        }
        else if(n%5==0){
            n/=5;
            f=true;
        }
        else if(n==1){
            f=true;
            n-=1;
        }
        else{
            return false;
        }
    }
    return true;
    }
}