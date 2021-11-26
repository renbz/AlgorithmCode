package 每日一题_2021_11月;

/**
 * @author Ren
 */

public class R11_26_0700_二叉搜索树中的搜索 {

    public TreeNode searchBST(TreeNode root, int val) {
        // 遍历二叉树
        if(root==null) return null;
        if(root.val==val) return root;
        if(root.val<val) return searchBST(root.right,val);
        if(root.val>val) return searchBST(root.left,val);
        return null;
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
