package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 14:21
 * @Description:
 */

public class Day02_0746_使用最小花费爬楼梯 {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

}
