package 每日一题_2022_06月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/28 15:09
 * @Description:
 */

public class R06_25_剑指_Offer_II_091_粉刷房子 {

    public int minCost(int[][] costs) {
        int n = costs.length;
        int[] dp = new int[3];
        for (int j = 0; j < 3; j++) {
            dp[j] = costs[0][j];
        }
        for (int i = 1; i < n; i++) {
            int[] dpNew = new int[3];
            for (int j = 0; j < 3; j++) {
                dpNew[j] = Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + costs[i][j];
            }
            dp = dpNew;
        }
        return Arrays.stream(dp).min().getAsInt();
    }

}
