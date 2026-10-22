class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int z = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                z = i;
                break;
            }
        }

        int ans = Integer.MAX_VALUE;

        boolean inc = true;
        for (int i = 1; i < n; i++) {
            int p = (z + i - 1) % n;
            int q = (z + i) % n;
            if (nums[q] != nums[p] + 1)
                inc = false;
        }

        if (inc) {
            ans = Math.min(ans, z);
            ans = Math.min(ans, n - z + 2);
        }

        boolean dec = true;
        for (int i = 1; i < n; i++) {
            int p = (z - i + 1 + n) % n;
            int q = (z - i + n) % n;
            if (nums[q] != nums[p] + 1)
                dec = false;
        }

        if (dec) {
            ans = Math.min(ans, z + 2);
            ans = Math.min(ans, n - z);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}