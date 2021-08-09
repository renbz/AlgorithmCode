package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R54_二叉搜索树的第k大节点 {

    int k, ans;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans;
    }

    // 中序遍历  左根右
    void dfs(TreeNode root) {
        if (root.right != null) dfs(root.right);
        if (k == 0) return;
        if (k-- == 1) ans = root.val;
        if (root.left != null) dfs(root.left);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
