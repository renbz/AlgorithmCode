package 学习计划.剑指Offer专项突击版.Day16_19_树;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/7 14:45
 * @Description:
 */

public class 剑指OfferII_056_二叉搜索树中两个节点之和 {

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if (set.contains(k - node.val)) return true;
            set.add(node.val);
            root = node.right;
        }
        return false;
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
