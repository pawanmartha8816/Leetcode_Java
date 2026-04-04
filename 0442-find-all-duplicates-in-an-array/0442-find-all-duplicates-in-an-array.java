class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] ar=new int[nums.length];
        for(int i:nums){
            ar[i-1]++;
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(ar[i]==2){
                a.add(i+1);
            }
        }
        return a;
    }
}