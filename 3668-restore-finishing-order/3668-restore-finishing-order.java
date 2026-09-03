class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int[] ans = new int[friends.length];
        int k = 0;

        for (int x : order) {
            for (int y : friends) {
                if (x == y) {
                    ans[k++] = x;
                    break;
                }
            }
        }

        return ans;
    }
}