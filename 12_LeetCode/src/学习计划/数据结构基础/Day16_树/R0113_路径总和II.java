package 学习计划.数据结构基础.Day16_树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R0113_路径总和II {
    int targetSum;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        if (root == null) return new ArrayList<>();
        dfs(root, 0, new ArrayList<>());
        return ans;
    }

    private void dfs(TreeNode root, int sum, List<Integer> list) {
        sum += root.val;
        list.add(root.val);
        if (sum == targetSum && root.left == null && root.right == null) {
            ans.add(list);
        } else if (sum < targetSum) {
            if (root.left != null) dfs(root.left, sum, new ArrayList<>(list));
            if (root.right != null) dfs(root.right, sum, new ArrayList<>(list));
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
