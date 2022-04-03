package 学习计划.编程能力.编程能力入门.Day10_链表树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 15:08
 * @Description:
 */

public class R0404_左叶子之和 {

    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return ans;
        if (root.left != null) sumOfLeftLeaves(root.left);
        if (root.right != null) sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == null && root.left.right == null) ans += root.left.val;
        return ans;
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
