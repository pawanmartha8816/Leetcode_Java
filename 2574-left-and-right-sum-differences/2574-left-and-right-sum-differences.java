class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            int l=0,r=0;
            for(int j=0;j<i;j++){
                l+=nums[j];
            }
            for(int j=i+1;j<n;j++){
                r+=nums[j];
            }
            ar[i]=Math.abs(l-r);
        }
        return ar;
    }
}