class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int[] ar=new int[n];
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums){
            ar[i-1]++;
        }
        for(int i=0;i<n;i++){
            if(ar[i]==0){
                a.add(i+1);
            }
        }
        return a;
    
    }
}