class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                a -= b << i;
                res |= 1 << i;
            }
        }
        return ((dividend ^ divisor) < 0) ? -res : res;
    }
}