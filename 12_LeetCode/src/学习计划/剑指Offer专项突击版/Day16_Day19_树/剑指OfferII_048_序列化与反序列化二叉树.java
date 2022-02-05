package 学习计划.剑指Offer专项突击版.Day16_Day19_树;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/5 00:14
 * @Description:
 */

public class 剑指OfferII_048_序列化与反序列化二叉树 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return dfs(queue);

    }

    private TreeNode dfs(Queue<String> queue) {

        String val = queue.poll();
        if ("null".equals(val)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = dfs(queue);
        root.right = dfs(queue);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
