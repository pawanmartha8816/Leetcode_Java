class Solution {
    public int[] moveZeroes(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }
        }
        return nums;
    }
}