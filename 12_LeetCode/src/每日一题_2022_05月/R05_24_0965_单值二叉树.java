package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/24 20:21
 * @Description:
 */

public class R05_24_0965_单值二叉树 {

    int num;
    boolean ans = true;

    public boolean isUnivalTree(TreeNode root) {
        num = root.val;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root.left != null) dfs(root.left);
        if (root.val != num){
            ans= false;
            return ;
        }
        if (root.right != null) dfs(root.right);
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
