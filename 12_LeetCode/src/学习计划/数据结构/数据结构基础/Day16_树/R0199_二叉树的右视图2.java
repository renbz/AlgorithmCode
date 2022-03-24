package 学习计划.数据结构.数据结构基础.Day16_树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ren
 */

public class R0199_二叉树的右视图2 {
    /**
     * 按照根左右的方式进行遍历
     */

    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int depth) {
        if(root==null) return;
        if(depth==res.size()) res.add(root.val);
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);
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
