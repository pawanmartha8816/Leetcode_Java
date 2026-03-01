class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]|nums[j])%2==0){
                    return true;
                }
            }
        }
        return false;
    }
}