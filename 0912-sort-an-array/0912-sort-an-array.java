class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            int j=i-1,t=nums[i];
            while(j>=0 && nums[j]>t)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=t;
        }
        return nums;
    }
}