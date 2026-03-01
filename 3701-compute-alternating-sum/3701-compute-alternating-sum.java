class Solution {
    public int alternatingSum(int[] no) {
        int n=no.length;
        int s=0,p=0;
        for(int i=0;i<n;i++){
            if(i%2==1){
                s+=no[i];
            }
            else p+=no[i];
        }
        return p-s;
    }
}