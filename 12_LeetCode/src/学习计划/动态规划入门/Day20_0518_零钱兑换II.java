package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 16:56
 * @Description:
 */

public class Day20_0518_零钱兑换II {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0]=1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
