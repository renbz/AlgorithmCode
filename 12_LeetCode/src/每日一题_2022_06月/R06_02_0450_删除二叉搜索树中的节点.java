package 每日一题_2022_06月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/2 22:49
 * @Description:
 */

public class R06_02_0450_删除二叉搜索树中的节点 {


    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (root.val == key) return format(root);
        dfs(root, key);
        return root;
    }

    private void dfs(TreeNode root, int key) {
        if (root == null) return;
        if (root.left != null && root.left.val == key) {
            root.left = format(root.left);
            return;
        }
        if (root.right != null && root.right.val == key) {
            root.right = format(root.right);
            return;
        }
        dfs(root.left, key);
        dfs(root.right, key);
    }

    private TreeNode format(TreeNode root) {
        if (root.left == null && root.right == null) return null; // 如果被删除的结点是叶节点，返回null即可
        if (root.left != null && root.right != null) { // 如果是分支结点，并且拥有左孩子和右孩子的话
            TreeNode temp = root.left.right;
            root.left.right = root.right;
            TreeNode cur = root.left.right;
            while (cur.left != null) cur = cur.left;
            cur.left = temp;
            return root.left;
        }
        if (root.left == null) return root.right;
        return root.left;
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
