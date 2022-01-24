package 学习计划.剑指Offer专项突击版.Day03_04_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 18:55
 * @Description:
 */

public class 剑指OfferII_013_二维子矩阵的和 {

    class NumMatrix {
        int[][] mat = null;
        public NumMatrix(int[][] mat) {
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
            this.mat = mat;
        }

        public int sumRegion(int m1, int n1, int m2, int n2) {
            int p1 = 0, p2 = 0, p3 = 0;
            if (m1 - 1 >= 0) p1 = mat[m1 - 1][n2];
            if (n1 - 1 >= 0) p2 = mat[m2][n1 - 1];
            if (m1 - 1 >= 0 && n1 - 1 >= 0) p3 = mat[m1 - 1][n1 - 1];
            return mat[m2][n2] - p1 - p2 + p3;
        }
    }

}
