class Solution {
    public int maximumDifference(int[] nums) {
        int mx=0,d=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    d=nums[j]-nums[i];
                    mx=Math.max(mx,d);
                }
            }
        }
        if(mx==0) return -1;
        return mx;
    }
}