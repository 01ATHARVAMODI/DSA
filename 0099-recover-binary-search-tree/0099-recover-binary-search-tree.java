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
    TreeNode a = null;
    TreeNode b = null;
    TreeNode p = null;

    public void recoverTree(TreeNode root) {
        find(root);

        int t = a.val;
        a.val = b.val;
        b.val = t;
    }

    void find(TreeNode r) {
        if (r == null)
            return;

        find(r.left);

        if (p != null && p.val > r.val) {
            if (a == null)
                a = p;
            b = r;
        }

        p = r;

        find(r.right);
    }
}