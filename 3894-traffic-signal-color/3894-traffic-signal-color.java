class Solution {
    public String trafficSignal(int t) {
        String r="Red";
        String o="Orange";
        String g="Green";
        String i="Invalid";
        if(t>30 && t<=90){
            return r;

        }
        else if(t==0) return g;
        else if(t==30) return o;
        return i;
    }
}