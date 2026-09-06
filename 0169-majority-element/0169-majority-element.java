class Solution {
    public int majorityElement(int[] nums) {

        int c = 0;
        int x = 0;

        for (int n : nums) {

            if (c == 0)
                x = n;

            if (n == x)
                c++;
            else
                c--;
        }

        return x;
    }
}