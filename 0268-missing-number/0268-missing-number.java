class Solution {
    public int missingNumber(int[] nu) {
        int s=0;
        int n=nu.length;
        for(int i:nu){
            s+=i;
        }
        int sum=(n*(n+1))/2;
        return sum-s;
    }
}