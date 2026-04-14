class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] ar=new int[26];
        for(char ch:s.toCharArray()){
            ar[(int)ch-97]++;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ar[(int)ch-97]==1){
                return i;
            }
        }
        return -1;
    }
}