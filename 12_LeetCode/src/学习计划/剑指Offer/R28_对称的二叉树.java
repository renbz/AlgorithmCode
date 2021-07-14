package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R28_对称的二叉树 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return is(root.left, root.right);

    }

    public boolean is(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return is(left.left, right.right) && is(left.right, right.left);
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
