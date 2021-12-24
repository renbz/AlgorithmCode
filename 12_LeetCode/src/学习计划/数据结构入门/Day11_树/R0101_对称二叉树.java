package 学习计划.数据结构入门.Day11_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/23 10:13
 * @Description:
 */

public class R0101_对称二叉树 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    private boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
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
