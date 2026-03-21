class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int min=n;
        int s=0;
        boolean f=false;
        while(j<n){
            s+=nums[j];
            //System.out.print(s);
            while(s>=t){
                System.out.print(j);
                min=Math.min(min,j-i+1);
                s-=nums[i];
                i++;
                f=true;
            }
            j++;
        }
        if(!f) return 0;
        return min;
    }
}