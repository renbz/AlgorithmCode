package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/20 17:00
 * @Description:
 */

public class Day17_0516_最长回文子序列 {

    public int longestPalindromeSubseq(String s) {
        String ss = new StringBuilder(s).reverse().toString();
        // 求s和ss的最长公共子序列
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (s.charAt(i-1) == ss.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len][len];
    }
}
