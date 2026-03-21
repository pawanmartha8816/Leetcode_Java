class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0;
        int c=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        for(int i:nums){
            s+=i;
            if(h.containsKey(s-k)){
                c+=h.get(s-k);
            }
            h.put(s,h.getOrDefault(s,0)+1);
        }
        return c;
    }
}