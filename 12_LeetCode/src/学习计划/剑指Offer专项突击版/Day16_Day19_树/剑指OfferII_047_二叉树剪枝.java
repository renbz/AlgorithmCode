package 学习计划.剑指Offer专项突击版.Day16_Day19_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/4 19:45
 * @Description:
 */

public class 剑指OfferII_047_二叉树剪枝 {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return root;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) {
            root = null;
        }
        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
