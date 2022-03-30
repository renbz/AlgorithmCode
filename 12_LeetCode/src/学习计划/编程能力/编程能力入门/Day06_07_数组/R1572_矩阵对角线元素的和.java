package 学习计划.编程能力.编程能力入门.Day06_07_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/30 18:09
 * @Description:
 */

public class R1572_矩阵对角线元素的和 {

    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0, mid = n / 2;
        for (int i = 0; i < n; ++i) {
            sum += mat[i][i] + mat[i][n - 1 - i];
        }
        return sum - mat[mid][mid] * (n & 1);
    }
}
