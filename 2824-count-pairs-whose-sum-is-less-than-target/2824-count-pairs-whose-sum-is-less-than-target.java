class Solution {
    public int countPairs(List<Integer> nu, int t) {
        int s=0;
        int n=nu.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((nu.get(i)+nu.get(j))<t && i<j) s++;
            }
        }
        return s;
    }
}