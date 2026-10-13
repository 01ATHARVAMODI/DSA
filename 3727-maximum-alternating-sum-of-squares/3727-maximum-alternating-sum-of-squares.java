import java.util.*;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = nums[i] * nums[i];

        Arrays.sort(a);

        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (i < n / 2)
                sum -= a[i];
            else
                sum += a[i];
        }

        return sum;
    }
}