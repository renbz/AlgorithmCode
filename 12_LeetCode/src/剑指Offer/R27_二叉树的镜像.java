package 剑指Offer;

/**
 * @author Ren
 */

public class R27_二叉树的镜像 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = mirrorTree(root.left);
        root.left = mirrorTree(root.right);
        root.right = tmp;
        return root;
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
