package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 23:09
 * @Description:
 */

public class 剑指OfferII_091_粉刷房子 {

    public int minCost(int[][] costs) {
        int[][] dp = new int[costs.length][3];
        for (int i = 0; i < 3; i++) dp[0][i] = costs[0][i];
        for (int i = 1; i < costs.length; i++) {
            //状态转换
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
        }
        return Math.min(dp[costs.length - 1][0], Math.min(dp[costs.length - 1][1], dp[costs.length - 1][2]));
    }

}
