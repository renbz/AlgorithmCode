package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/16 14:38
 * @Description:
 */

public class Day11_0264_丑数II {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) p2++;
            if (dp[i] == num3) p3++;
            if (dp[i] == num5) p5++;
        }
        return dp[n];
    }

}
