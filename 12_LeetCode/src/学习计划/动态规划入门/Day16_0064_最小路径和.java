package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/19 11:34
 * @Description:
 */

public class Day16_0064_最小路径和 {

    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // 初始化数组
        for (int i = 1; i < m; i++) grid[i][0] += grid[i - 1][0];
        for (int i = 1; i < n; i++) grid[0][i] += grid[0][i - 1];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }

}
