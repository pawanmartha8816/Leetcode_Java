class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int d) {
        int n=nums.length;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    max=Math.max(max,nums[j]);
                }
            }
            ar[i]=max;
        }
        ArrayList<Boolean> t=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((nums[i]+d)>=ar[i]){
                t.add(true);
            }
            else{
                t.add(false);
            }
        }
        return t;
    }
}