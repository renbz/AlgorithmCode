package 学习计划.数据结构.数据结构入门.Day13_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/23 11:37
 * @Description:
 */

public class R0701_二叉搜索树中的插入操作 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        dfs(root,val);
        return root;
    }

    public void dfs(TreeNode root, int val) {
        if (root.val > val && root.left != null) { // 进入左子树
            dfs(root.left,val);
        }else if (root.val > val && root.left == null) {
            root.left = new TreeNode(val);
        }else if (root.val < val && root.right != null) { // 进入右子树
            dfs(root.right,val);
        }else {
            root.right = new TreeNode(val);
        }
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
