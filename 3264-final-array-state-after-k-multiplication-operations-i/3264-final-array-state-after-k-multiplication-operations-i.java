class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int mn=0;
        for(int i=0;i<k;i++){
            mn=min(nums);
            for(int j=0;j<nums.length;j++){
                if(nums[j]==mn){
                    nums[j]*=m;
                    break;
                }
            }
        }
        return nums;
    }
    public int min(int[] ar){
        int a=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<a){
                a=ar[i];
            }
        }
        return a;
    }
}