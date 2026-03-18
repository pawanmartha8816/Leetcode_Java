class Solution {
    public char repeatedCharacter(String s) {
        char ans='.';
        int[] cnt=new int[26];
        for(char ch:s.toCharArray()){
            int a=(int)ch-97;
            cnt[a]++;
            if(cnt[a]==2){
                ans=ch;
                break;
            }
        }
        return ans;
    }
}