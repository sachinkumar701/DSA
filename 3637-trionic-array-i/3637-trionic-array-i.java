class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // 1) strictly increasing
        while (i < n - 2 && nums[i] < nums[i + 1]) {
            i++;
        }
        // no increasing part
        if (i == 0) return false;

        int j = i;

        // 2) strictly decreasing
        while (j < n - 1 && nums[j] > nums[j + 1]) {
            j++;
        }
        // no decreasing part OR no space for third part
        if (j == i || j == n - 1) return false;

        // 3) strictly increasing again
        while (j < n - 1 && nums[j] < nums[j + 1]) {
            j++;
        }

        // must reach the end
        return j == n - 1;
    }
}
