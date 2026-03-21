class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==1) return 1;
        int i=0;
        int j=0;
        int m=0;
        int sum=0;
        HashSet<Character> a=new HashSet<>();
        while(j<n){
            if(!(a.contains(s.charAt(j)))){
                a.add(s.charAt(j));
                sum=a.size();
                m=Math.max(m,sum);
                j++;
            }
            else{
                while(s.charAt(i)!=s.charAt(j)){
                    a.remove(s.charAt(i));
                    i++;
                }
                a.remove(s.charAt(i));
                i++;
            }
            //m=Math.max(m,sum);
        }
        return m;
    }
}