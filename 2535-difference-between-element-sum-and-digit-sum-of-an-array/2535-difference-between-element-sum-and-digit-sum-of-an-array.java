class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0;
        int s2=0;
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            s2+=solve(nums[i]);
        }
        return Math.abs(s1-s2);
    }
    public int solve(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}