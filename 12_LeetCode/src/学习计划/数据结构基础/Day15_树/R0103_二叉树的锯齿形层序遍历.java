package 学习计划.数据结构基础.Day15_树;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ren
 */

public class R0103_二叉树的锯齿形层序遍历 {

    //  DFS
    List<List<Integer>> ans = new LinkedList<List<Integer>>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return ans;
        DFS(root, 0);
        return ans;
    }

    protected void DFS(TreeNode node, int level) {
        if (level == ans.size()) {
            List<Integer> list = new LinkedList<>();
            list.add(node.val);
            ans.add(list);
        } else if (level % 2 == 0) {
            ans.get(level).add(node.val);
        } else {
            ans.get(level).add(0, node.val);
        }
        if (node.left != null) DFS(node.left, level + 1);
        if (node.right != null) DFS(node.right, level + 1);
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
