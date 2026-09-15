class Solution {
    public int[] pivotArray(int[] nums, int k) {
        int n=nums.length;
        int[] dup=new int[n];
        int s=0;
        int l=0;
        int g=0;
        for(int i=0;i<n;i++){
            dup[i]=nums[i];
            if(dup[i]<k) l++;
            else if(dup[i]==k) g++;
        }
        g=g+l;
        for(int i=0;i<n;i++){
            if(dup[i]<k){
                nums[s++]=dup[i];
            }
            else if(dup[i]==k){
                nums[l++]=dup[i];
            }
            else{
                nums[g++]=dup[i];
            }
        }
        return nums;
    }
}