package 每日一题_2022_07月;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/25 18:59
 * @Description:
 */

public class R07_25_0919_完全二叉树插入器 {

    class CBTInserter {

        Queue<TreeNode> target;
        TreeNode root;

        public CBTInserter(TreeNode root) {
            this.target = new ArrayDeque<>();
            this.root = root;
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (node.left == null || node.right == null) {
                    target.offer(node);
                }
            }

        }

        public int insert(int val) {
            TreeNode child = new TreeNode(val);
            TreeNode node = target.peek();
            int ret = node.val;
            if (node.left == null) {
                node.left = child;
            } else {
                node.right = child;
                target.poll();
            }
            target.offer(child);

            return ret;
        }

        public TreeNode get_root() {
            return root;
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
