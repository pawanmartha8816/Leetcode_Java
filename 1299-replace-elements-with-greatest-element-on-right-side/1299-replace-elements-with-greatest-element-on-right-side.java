class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] ar=new int[n];
        for(int i=0;i<n-1;i++){
            int m=0;
            for(int j=i+1;j<n;j++){
                m=Math.max(m,arr[j]);
            }
            ar[i]=m;
        }
        ar[n-1]=-1;
        return ar;
    }
}