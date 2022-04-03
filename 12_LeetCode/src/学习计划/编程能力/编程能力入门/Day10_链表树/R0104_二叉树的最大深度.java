package 学习计划.编程能力.编程能力入门.Day10_链表树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/2 21:38
 * @Description:
 */

public class R0104_二叉树的最大深度 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return getDepth(root, 1);
    }

    public int getDepth(TreeNode node, int hight) {
        if (node.left == null && node.right == null) return hight;
        if (node.left != null && node.right != null)
            return Math.max(getDepth(node.left, hight + 1), getDepth(node.right, hight + 1));
        if (node.left != null) return getDepth(node.left, hight + 1);
        if (node.right != null) return getDepth(node.right, hight + 1);
        else return -1;
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
