class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int is=0;
        for(int i=0;i<k;i++){
            is+=nums[i];
        }
        int i=0,j=i+k-1;
        int max=is;
        int sum=is;
        while(j+1<n){
            sum+=nums[j+1];
            sum-=nums[i];
            max=Math.max(max,sum);
            j++;
            i++;
        }
        return (double)max/k;
    }
}