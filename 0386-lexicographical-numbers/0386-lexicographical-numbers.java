class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= 9; i++)
            dfs(i, n, ans);

        return ans;
    }

    void dfs(int x, int n, List<Integer> ans) {
        if (x > n)
            return;

        ans.add(x);

        for (int i = 0; i <= 9; i++)
            dfs(x * 10 + i, n, ans);
    }
}