package 学习计划.剑指Offer专项突击版.Day16_Day19_树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/5 17:36
 * @Description:
 */

public class 剑指OfferII_050_向下的路径节点之和 {

    Map<Integer, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0, 1);
        return dfs(root, targetSum, 0);
    }

    private int dfs(TreeNode root, int targetSum, int sum) {
        if (root == null) return 0;
        int res = 0;
        sum += root.val;
        res += map.getOrDefault(sum - targetSum, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        res += dfs(root.left, targetSum, sum);
        res += dfs(root.right, targetSum, sum);
        map.put(sum, map.get(sum) - 1);
        return res;
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
