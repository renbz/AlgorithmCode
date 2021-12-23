package 学习计划.数据结构入门.Day10_树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 14:27
 * @Description:
 */

public class R0094_二叉树的中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            ans.add(node.val);
            if (node.right != null) cur = node.right;
        }
        return ans;
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
