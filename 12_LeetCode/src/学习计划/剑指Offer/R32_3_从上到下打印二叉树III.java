package 学习计划.剑指Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ren
 */

public class R32_3_从上到下打印二叉树III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);

        boolean flag = true;
        while (!queue.isEmpty()) {
            flag = !flag;
            LinkedList<Integer> sublist = new LinkedList<>();
            int t = queue.size();
            for (int i = 0; i < t; i++) {
                TreeNode curNode = queue.poll();
                if (curNode != null) {
                    if (flag) {
                        sublist.addFirst(curNode.val);
                    } else {
                        sublist.add(curNode.val);
                    }
                    if (curNode.left != null) queue.add(curNode.left);
                    if (curNode.right != null) queue.add(curNode.right);
                }
            }
            list.add(sublist);
        }
        return list;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
