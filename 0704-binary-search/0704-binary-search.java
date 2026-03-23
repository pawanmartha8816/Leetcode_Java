class Solution {
    public int search(int[] ar, int k) {
        int l=0,h=ar.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            //System.out.print(mid);
            if(ar[mid]==k){
                return mid;
            }
            else if(ar[mid]<k){
                l=mid+1;
            }
            else if(ar[mid]>k){
                h=mid-1;
            }
            else break;
        }
        return -1;
    }
}