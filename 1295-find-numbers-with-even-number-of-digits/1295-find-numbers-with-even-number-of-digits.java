class Solution {
    public int findNumbers(int[] nums) {
        int s=0;
        for(int i:nums){
            if(solution(i)){
                s++;
            }
        }
        return s;
    }
    public boolean solution(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        if(c%2==0){
            return true;
        }
        return false;
    }
}