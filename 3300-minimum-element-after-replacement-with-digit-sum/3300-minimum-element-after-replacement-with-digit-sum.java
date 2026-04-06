class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=solve(nums[i]);
        }
        int min=10001;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public int solve(int n){
        int s=0;
        while(n!=0){
            int d=n%10;
            s+=d;
            n/=10;

        }
        return s;
    }
}