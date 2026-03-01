class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] ar, int n) {
        int s=0;
        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]>=n){
                s++;
            }
        }
        return s;
    }
}