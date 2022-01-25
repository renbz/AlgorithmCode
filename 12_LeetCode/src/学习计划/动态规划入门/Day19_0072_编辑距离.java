package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 10:39
 * @Description:
 */

public class Day19_0072_编辑距离 {

    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        if (m * n == 0) return n + m;
        int[][] dp = new int[n + 1][m + 1];

        //边界状态初始化
        for (int i = 0; i < n + 1; i++) dp[i][0] = i;
        for (int i = 0; i < m + 1; i++) dp[0][i] = i;

        //计算所有dp的值
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int left = dp[i - 1][j]+1, down = dp[i][j - 1]+1, l_d = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) l_d++;
                dp[i][j] = Math.min(left, Math.min(down, l_d));
            }
        }
        return dp[n][m];
    }

}
