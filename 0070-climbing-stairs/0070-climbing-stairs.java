class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int pre = 1;
        int prePre = 1;

        for (int i = 2; i <= n; i++) {
            int curr = pre + prePre;
            prePre = pre;
            pre = curr;
        }

        return pre;
    }
}