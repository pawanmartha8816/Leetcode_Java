class Solution {
    public int searchInsert(int[] nums, int k) {
        int c=0,ans=0;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<k){
                ans=i;
                break;
            }
            c++;
        }
        if(c==n) return 0;
        return ans+1;
    }
}