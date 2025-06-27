class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flip = new int[n];
        int currFlip = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                currFlip ^= flip[i - k];
            }
            if ((nums[i] + currFlip) % 2 == 0) {
                if (i + k > n) {
                    return -1;
                }
                currFlip ^= 1;
                res++;
                flip[i] = 1;
            }
        }
        return res;
    }
}
