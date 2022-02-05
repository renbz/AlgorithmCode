package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/5 19:35
 * @Description:
 */

public class R0897_递增顺序搜索树 {

    TreeNode ans = new TreeNode(), cur = ans;

    public TreeNode increasingBST(TreeNode root) {
        //中序遍历，将遍历结果添加到ans中
        dfs(root);
        return ans.right;
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        //左根右
        dfs(root.left);
        cur.right = new TreeNode(root.val);
        cur = cur.right;
        dfs(root.right);
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
