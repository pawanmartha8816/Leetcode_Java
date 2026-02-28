class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int s=0;
        for(int ia:nums1){
            for(int iz:nums2){
                if(ia%(k*iz)==0) s++;
            }
        }
        return s;
    }
}