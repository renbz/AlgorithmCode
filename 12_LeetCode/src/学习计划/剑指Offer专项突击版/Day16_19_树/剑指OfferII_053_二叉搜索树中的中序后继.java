package 学习计划.剑指Offer专项突击版.Day16_19_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/6 16:39
 * @Description:
 */

public class 剑指OfferII_053_二叉搜索树中的中序后继 {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode ans = null;
        // 在二叉树中进行搜索
        while (root != null) {
            if (root.val > p.val) {
                ans = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return ans;
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
