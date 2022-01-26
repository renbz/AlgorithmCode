package 学习计划.动态规划入门;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 21:39
 * @Description:
 */

public class Day21_0279_完全平方数 {

    public int numSquares(int n) {
        // 动态规划 类似于零钱兑换
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

}
