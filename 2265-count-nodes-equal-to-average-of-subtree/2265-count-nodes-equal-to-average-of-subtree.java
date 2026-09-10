/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c = 0;

    public int averageOfSubtree(TreeNode root) {
        sum(root);
        return c;
    }

    int[] sum(TreeNode r) {
        if (r == null)
            return new int[]{0, 0};

        int[] l = sum(r.left);
        int[] x = sum(r.right);

        int s = l[0] + x[0] + r.val;
        int n = l[1] + x[1] + 1;

        if (s / n == r.val)
            c++;

        return new int[]{s, n};
    }
}