package 每日一题_2021_12月;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/25 15:15
 * @Description:
 */

public class R12_25_1609_奇偶树 {

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flagO = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                int t = node.val;
                if (flagO) {
                    // 判断是否为奇数 且升序
                    if (t > min && t % 2 == 1) {
                        min = t;
                    } else {
                        return false;
                    }
                } else {
                    // 为偶数且递减
                    if (t < max && t % 2 == 0) {
                        max = t;
                    } else {
                        return false;
                    }
                }
            }
            flagO = !flagO;
        }
        return true;
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
