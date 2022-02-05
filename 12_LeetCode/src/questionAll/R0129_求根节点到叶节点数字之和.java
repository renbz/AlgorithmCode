package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/5 00:23
 * @Description:
 */

public class R0129_求根节点到叶节点数字之和 {

    int ans = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, new StringBuilder(String.valueOf(root.val)));
        return ans;
    }

    void dfs(TreeNode root, StringBuilder builder) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            ans += Integer.valueOf(builder.toString());
        }
        if (root.left != null) dfs(root.left, new StringBuilder(builder).append(root.left.val));
        if (root.right != null) dfs(root.right, new StringBuilder(builder).append(root.right.val));
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
