package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/19 11:29
 * @Description:
 */

public class Day15_0063_不同路径II {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (obstacleGrid[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

}
