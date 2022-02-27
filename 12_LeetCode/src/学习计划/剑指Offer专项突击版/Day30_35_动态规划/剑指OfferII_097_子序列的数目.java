package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/27 22:30
 * @Description:
 */

public class 剑指OfferII_097_子序列的数目 {

    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) return 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) dp[i][n] = 1;
        for (int i = m - 1; i >= 0; i--) {
            char cs = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char ct = t.charAt(j);
                if (cs == ct) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }

}
