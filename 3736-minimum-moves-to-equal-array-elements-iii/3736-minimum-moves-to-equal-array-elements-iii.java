class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int n : nums) {
            max = Math.max(max, n);
            sum += n;
        }

        return max * nums.length - sum;
    }
}