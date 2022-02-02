package 学习计划.剑指Offer专项突击版.Day14_15_队列;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/2 20:00
 * @Description:
 */

public class 剑指OfferII_043_往完全二叉树添加节点 {


    class CBTInserter {

        private TreeNode root;
        private Queue<TreeNode> queue;

        public CBTInserter(TreeNode root) {
            this.root = root;
            queue = new LinkedList<>();
            queue.offer(root);
        }

        public int insert(int v) {
            TreeNode nxt = new TreeNode(v);
            while (queue.peek().left != null && queue.peek().right != null) {
                TreeNode node = queue.poll();
                queue.offer(node.left);
                queue.offer(node.right);
            }
            TreeNode peek = queue.peek();
            if (peek.left == null) {
                peek.left = nxt;
                return peek.val;
            }
            peek.right = nxt;
            return peek.val;
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
