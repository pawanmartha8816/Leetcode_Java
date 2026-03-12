class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0,b=0;
        for(int i:nums){
            if(i<10){
                a+=i;
            }
            else{
                b+=i;
            }
        }
        if(a!=b) return true;
        return false;
    }
}