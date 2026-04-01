class Solution {
    public int findDuplicate(int[] nums) {
        int[] ar=new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]-1]++;
        }
        int ans=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>1){
                ans=i+1;
            }
        }
    
    return ans;
    }
}