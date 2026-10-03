class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n;

        while (l < r) {
            int m = l + ((r - l) / 2);

            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m;
        }
        return -1;
    }
}
