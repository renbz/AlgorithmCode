package 学习计划.数据结构入门.Day14_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/23 11:56
 * @Description:
 */

public class R0098_验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {

        return true;
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
