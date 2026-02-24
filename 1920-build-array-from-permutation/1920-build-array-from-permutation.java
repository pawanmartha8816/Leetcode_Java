class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int j=0;
        for(int i:nums){
            a[j++]=nums[i];
        }
        return a;
    }
}