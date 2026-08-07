class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int n : nums) {
            int d = 0;
            while (n > 0) {
                d++;
                n /= 10;
            }
            if (d % 2 == 0)
                c++;
        }
        return c;
    }
}