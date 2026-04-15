class Solution {
    public int getMinDistance(int[] nums, int t, int s) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==t){
                min=Math.min(min,Math.abs(i-s));
            }
        }
        return min;
    }
}