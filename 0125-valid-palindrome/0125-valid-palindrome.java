class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        s=s.toLowerCase();
        //System.out.print(s);
        StringBuilder s1=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                s1.append(ch);
            }
        }
        System.out.print(s1);
        int i=0,j=s1.length()-1;
        while(i<=j){
            char ch1=s1.charAt(i);
            char ch2=s1.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}