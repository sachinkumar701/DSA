class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0, jumps = 0;
        while (r < nums.length - 1) {
            int maxi = 0;
            for (int i = l; i <= r; i++) {
                maxi = Math.max(maxi, i + nums[i]);
            }
            l = r + 1;
            r = maxi;
            jumps++;
        }
        return jumps;
    }
}