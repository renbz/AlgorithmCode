package 学习计划.高效制胜.Day11_图;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/14 10:13
 * @Description:
 */

public class R0329_矩阵中的最长递增路径 {

    public int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int rows, columns;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        rows = matrix.length;
        columns = matrix[0].length;
        int[][] memo = new int[rows][columns];
        int ans = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                ans = Math.max(ans, dfs(matrix, i, j, memo));
            }
        }
        return ans;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] memo) {

        if (memo[i][j] != 0) return memo[i][j];
        memo[i][j]++;
        for (int[] dir : dirs) {
            int i_ = i + dir[0], j_ = j + dir[1];
            if (i_ >= 0 && i_ < rows && j_ >= 0 && j_ < columns && matrix[i_][j_] > matrix[i][j]) {
                memo[i][j] = Math.max(memo[i][j], dfs(matrix, i_, j_, memo) + 1);
            }
        }
        return memo[i][j];
    }

}
