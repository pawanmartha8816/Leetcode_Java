class Solution {
    public boolean detectCapitalUse(String s) {
        int c=0;
        if(Character.isUpperCase(s.charAt(0))){
            c++;
        }
        int a=0,b=0;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)) a++;
            if(Character.isLowerCase(ch)) b++;
        }
        System.out.print(a);
        System.out.print(b);
        if(a==0 || b==0 || a==c){
            return true;
        }
        return false;
    }
}