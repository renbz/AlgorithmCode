package 学习计划.数据结构基础.Day16_树;

/**
 * @author Ren
 */

public class R0450_删除二叉搜索树中的节点 {

    int t = 0;

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null || root.val == key && root.left == null && root.right == null) return null;
        _deleteNode(root, key);
        return root;
    }

    public void _deleteNode(TreeNode root, int key) {
        //被删除节点无左右节点的情况
        if (root.val == key && root.left == null && root.right == null) root = null;
            // 被删除节点只有左节点的情况
        else if (root.val == key && root.left != null && root.right == null) root = root.left;
            // 被删除节点只有左节点的情况
        else if (root.val == key && root.left == null && root.right != null) root = root.right;
            // 被删除节点存在左右节点的情况
        else if (root.val == key && root.left != null && root.right != null) {
            // 寻找左子树的最大节点或右子树的最小节点
            deleteDoubleSon(root);
            root.val = t;
        } else if (root.val > key && root.left != null) _deleteNode(root.left, key);
        else if (root.val < key && root.right != null) _deleteNode(root.right, key);
    }

    private void deleteDoubleSon(TreeNode root) {
        TreeNode cur = root.left;
        while (cur.right != null) cur = cur.right;
        t = cur.val;
        root.left = cur.left == null ? null : cur.left;
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
