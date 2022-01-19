package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/18 12:26
 * @Description:
 */

public class R68_II_二叉搜索树的最近公共祖先 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) return root;
        boolean left = searchNode(root.left, p, q), right = searchNode(root.right, p, q);
        if (left && right) return root;
        if (left) return lowestCommonAncestor(root.left, p, q);
        if (right) return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    boolean searchNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        if (root.val == p.val || root.val == q.val) return true;
        return searchNode(root.left, p, q) || searchNode(root.right, p, q);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
