class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(a, t, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int[] a, int t, int i, List<Integer> l,
               List<List<Integer>> ans) {

        if (t == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }

        if (t < 0 || i == a.length)
            return;

        l.add(a[i]);
        solve(a, t - a[i], i, l, ans);

        l.remove(l.size() - 1);
        solve(a, t, i + 1, l, ans);
    }
}