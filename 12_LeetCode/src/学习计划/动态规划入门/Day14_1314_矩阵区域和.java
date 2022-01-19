package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/19 09:24
 * @Description:
 */

public class Day14_1314_矩阵区域和 {

    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        // 先横向加
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
        // 纵向加
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                mat[j][i] += mat[j - 1][i];
            }
        }

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int m1 = Math.max(0, i - k), n1 = Math.max(0, j - k);
                int m2 = Math.min(i + k, m - 1), n2 = Math.min(j + k, n - 1);
                int p1 = 0, p2 = 0, p3 = 0;
                if (m1 - 1 >= 0) p1 = mat[m1 - 1][n2];
                if (n1 - 1 >= 0) p2 = mat[m2][n1 - 1];
                if (m1 - 1 >= 0 && n1 - 1 >= 0) p3 = mat[m1 - 1][n1 - 1];
                ans[i][j] = mat[m2][n2] - p1 - p2;
            }
        }
        return ans;
    }

}
