class Solution {
    public List<Integer> findWordsContaining(String[] s, char x) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length;i++){
            if(s[i].contains(String.valueOf(x))){
                l.add(i);
            }
        }
        return l;

    }
}