class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int i = 0, j = n - 1;
        int p = 1;
        int max = 0;
        while (i < j) {
            int w = j - i;
            int min = Math.min(h[i], h[j]);
            p = w * min;
            max = Math.max(p, max);
            if (h[i] < h[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}