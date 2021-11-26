package 每日一题_2021_11月;

/**
 * @author Ren
 */

public class R11_26_0700_二叉搜索树中的搜索2 {

    public TreeNode searchBST(TreeNode root, int val) {
        // 遍历二叉树
        while (root!=null){
            if(root.val==val){
                return root;
            }
            root=root.val>val?root.left:root.right;
        }
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
