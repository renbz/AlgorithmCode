package 学习计划.剑指Offer专项突击版.Day16_Day19_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/6 17:09
 * @Description:
 */

public class 剑指OfferII_054_所有大于等于节点的值之和 {

    int add = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            root.val += add;
            add = root.val;
            convertBST(root.left);
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
