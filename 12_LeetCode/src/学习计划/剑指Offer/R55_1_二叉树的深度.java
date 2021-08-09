package 学习计划.剑指Offer;

import questionAll.R0104_二叉树的最大深度;

/**
 * @author Ren
 */

public class R55_1_二叉树的深度 {

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int k) {
        int l = 0, r = 0;
        if (root.left != null) l = dfs(root.left, k + 1);
        if (root.right != null) r = dfs(root.right, k + 1);
        return Math.max(l, r)+1;
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
