package Other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R0113_路径总和II {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return new ArrayList<>();
        dfs(root.val, root, target, new ArrayList<>());
        return list;
    }

    public void dfs(int sum, TreeNode node, int target, List<Integer> sublist) {
        int val = node.val;
        sublist.add(val);
        if (sum == target && node.left == null && node.right == null) {
            list.add(new ArrayList<>(sublist));
        }
        if (node.left != null) {
            dfs(sum + node.left.val, node.left, target, sublist);
            sublist.remove(sublist.size() - 1);
        }

        if (node.right != null) {
            dfs(sum + node.right.val, node.right, target, sublist);
            sublist.remove(sublist.size() - 1);
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
