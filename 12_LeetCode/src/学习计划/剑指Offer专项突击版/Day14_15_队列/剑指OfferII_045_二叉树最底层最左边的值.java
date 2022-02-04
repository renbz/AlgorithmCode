package 学习计划.剑指Offer专项突击版.Day14_15_队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/3 18:02
 * @Description:
 */

public class 剑指OfferII_045_二叉树最底层最左边的值 {

    public int findBottomLeftValue(TreeNode root) {
        //找出最底层 最左边的节点的值
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = queue.size(), t = size, ans = 0;
        while (size-- > 0) {
            TreeNode poll = queue.poll();
            if (poll.left != null) queue.add(poll.left);
            if (poll.right != null) queue.add(poll.right);
            if (size == t - 1) ans = poll.val;
            if (size == 0) {
                size = queue.size();
                t = size;
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
