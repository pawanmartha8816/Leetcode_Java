class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                x|=nums[i];
                //System.out.print(x);
            }
        }
        return x;
    }
}