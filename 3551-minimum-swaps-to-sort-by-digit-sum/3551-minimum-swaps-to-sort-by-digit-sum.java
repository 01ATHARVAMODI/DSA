import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++)
            a[i] = nums[i];

        Arrays.sort(a, (x, y) -> {
            int s1 = sum(x), s2 = sum(y);
            if (s1 != s2)
                return s1 - s2;
            return x - y;
        });

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            map.put(a[i], i);

        boolean[] vis = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] || map.get(nums[i]) == i)
                continue;

            int j = i, c = 0;

            while (!vis[j]) {
                vis[j] = true;
                j = map.get(nums[j]);
                c++;
            }

            ans += c - 1;
        }

        return ans;
    }

    int sum(int n) {
        int s = 0;

        while (n > 0) {
            s += n % 10;
            n /= 10;
        }

        return s;
    }
}