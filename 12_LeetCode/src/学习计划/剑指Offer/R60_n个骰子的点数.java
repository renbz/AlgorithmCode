package 学习计划.剑指Offer;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 15:09
 * @Description:
 */

public class R60_n个骰子的点数 {
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);
        for (int i = 2; i <= n; i++) {
            double[] tmp = new double[5 * i + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    tmp[j + k] += dp[j] / 6.0;
                }
            }
            dp = tmp;
        }
        return dp;
    }
}
