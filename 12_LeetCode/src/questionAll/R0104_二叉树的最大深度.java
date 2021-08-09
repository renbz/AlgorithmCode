package questionAll;

/**
 * @author Ren
 */

public class R0104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int k) {
        int l = 0, r = 0;
        if (root.left != null) l = dfs(root.left, k + 1);
        if (root.right != null) r = dfs(root.right, k + 1);
        return Math.max(l, r) + 1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
