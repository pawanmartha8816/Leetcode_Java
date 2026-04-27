class Solution {
    public int arraySign(int[] nums) {
        int z=0,p=0,n=0;
        for(int i:nums){
            if(i==0) z++;
            if(i>0) p++;
            if(i<0) n++;
        }
        if(z!=0) return 0;
        if(n%2!=0) return -1;
        return 1;
    }
}