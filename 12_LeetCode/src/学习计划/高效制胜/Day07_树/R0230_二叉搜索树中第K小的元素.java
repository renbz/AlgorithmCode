package 学习计划.高效制胜.Day07_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/7 23:25
 * @Description:
 */

public class R0230_二叉搜索树中第K小的元素 {

    int ans =0,k=0;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root.left != null) dfs(root.left);
        if (k-- == 1) {
            ans = root.val;
            return;
        }
        if (root.right != null) dfs(root.right);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
