class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0,j=n-1,a=0,b=0;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else if(sum==target){
                a=i;
                b=j;
                break;
            }
        }
        int[] ans=new int[2];
        ans[0]=a+1;
        ans[1]=b+1;
        return ans;
    }
}