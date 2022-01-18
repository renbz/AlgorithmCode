package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/18 09:57
 * @Description:
 */

public class Day13_0931_下降路径最小和 {

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, ans = Integer.MAX_VALUE;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
                if (j - 1 >= 0) a = matrix[i - 1][j - 1];
                if (j + 1 < n) b = matrix[i - 1][j + 1];
                matrix[i][j] += Math.min(matrix[i - 1][j], Math.min(a, b));
            }
        }
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, matrix[m - 1][i]);
        }
        return ans;
    }

}
