class Solution {
    public int countPrimeSetBits(int l, int r) {
        int co=0;
        for(int y=l;y<=r;y++){
            int c=0;
            int i=y;
            while(i!=0){
                c++;
                i=i&(i-1);
            }
            if(isp(c)){
                co++;
            }
        }
        return co;
    }
    public boolean isp(int n){
        HashSet<Integer> h=new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29));
        if(h.contains(n)){
            return true;
        }
        return false;
    }
}