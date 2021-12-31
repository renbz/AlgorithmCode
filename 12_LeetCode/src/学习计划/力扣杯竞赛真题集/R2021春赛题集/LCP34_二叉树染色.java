package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 13:14
 * @Description:
 */

public class LCP34_二叉树染色 {

    public int maxValue(TreeNode root, int k) {

        int[] dp = dynamic(root, k);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= k; i++) {
            // 取root的各种染色情况的最大值
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    private int[] dynamic(TreeNode root, int k) {
        int[] dp = new int[k + 1];
        //1. 初始化: 空节点为底，自底向上
        if (root == null) return dp;
        //2. 获取左右子树染色的dp表
        int[] l = dynamic(root.left, k);
        int[] r = dynamic(root.right, k);
        //3. 更新处理root  染色/不染色 的情况下的dp表
        // 不染root
        int ml = Integer.MIN_VALUE, mr = Integer.MIN_VALUE;
        for (int i = 0; i <= k; i++) {
            ml = Math.max(ml, l[i]);
            mr = Math.max(mr, r[i]);
        }
        dp[0] = ml + mr;
        //染root
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < i; j++) {
                // 还需要染色i-1个点，左子树j个，右子树i-1-j个
                dp[i] = Math.max(dp[i], root.val + l[j] + r[i - 1 - j]);
            }
        }
        // 更新完毕，返回后继续向上动态规划
        return dp;
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
