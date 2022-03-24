package 学习计划.数据结构.数据结构基础.Day17_树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R0173_二叉搜索树迭代器 {
    class BSTIterator {

        List<Integer> list = new ArrayList<>();
        int index = -1;

        public BSTIterator(TreeNode root) {
            dfs(root);
        }

        public void dfs(TreeNode root) {
            // 中序遍历
            if (root.left != null) dfs(root.left);
            list.add(root.val);
            if (root.right != null) dfs(root.right);
        }

        public int next() {
            return list.get(index++);
        }

        public boolean hasNext() {
            return list.size() > index + 1;
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
