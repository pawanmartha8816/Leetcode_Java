class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n=nums.length;
        int[] ans=new int[2];
        int[] dup=Arrays.copyOf(nums,n);
        int i=0,j=n-1;
        int a=0,b=0;
        Arrays.sort(nums);
        while(i<j){
            int s=nums[i]+nums[j];
            if(s==t){
                a=nums[i];
                b=nums[j];
                break;
            }
            else if(s>t){
                j--;
            }
            else if(s<t){
                i++;
            }
        }
        for(int in=0;in<n;in++){
            if(dup[in]==a || dup[in]==b){
                ans[0]=in;
                break;
            }
        }
        for(int in=ans[0]+1;in<n;in++){
            if(dup[in]==a || dup[in]==b){
                ans[1]=in;
                break;
            }
        }
        return ans;
    }
}