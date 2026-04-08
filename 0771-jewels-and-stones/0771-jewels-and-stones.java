class Solution {
    public int numJewelsInStones(String j, String s) {
        int c=0;
        for(char a:j.toCharArray()){
            for(char b:s.toCharArray()){
                if(a==b){
                    c++;
                }
            }
        }
        return c;
    }
}