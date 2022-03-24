package 学习计划.数据结构.数据结构入门.Day10_树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 15:10
 * @Description:
 */

public class R0145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left != null && node.left != cur && node.right != cur) {
                stack.push(node.left);
            } else if (node.right != null && node.right != cur) {
                stack.push(node.right);
            } else {
                ans.add(stack.pop().val);
                cur = node;
            }
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
