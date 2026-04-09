class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length,in=0;
        k=k%n;
        rotates(nums,0,n-1);
        rotates(nums,0,k-1);
        rotates(nums,k,n-1);
    }
    public int[] rotates(int[] ar,int i,int j){
        while(i<j){
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
            i++;
            j--;
        }
        return ar;
    }
}