package 学习计划.剑指Offer专项突击版.Day14_15_队列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/3 18:20
 * @Description:
 */

public class 剑指OfferII_046_二叉树的右侧视图 {

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        queue.add(root);
        int size = queue.size();
        while (size-- > 0) {
            TreeNode poll = queue.poll();
            if (poll.left != null) queue.add(poll.left);
            if (poll.right != null) queue.add(poll.right);

            if (size == 0) {
                ans.add(poll.val);
                size = queue.size();
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
