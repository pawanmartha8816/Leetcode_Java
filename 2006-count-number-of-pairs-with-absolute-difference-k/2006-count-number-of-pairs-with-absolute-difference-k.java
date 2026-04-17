class Solution {
    public int countKDifference(int[] nums, int k) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if((Math.abs(nums[i]-nums[j])==k)) c++;
                }
            }
        }
        return c/2;
    }
}