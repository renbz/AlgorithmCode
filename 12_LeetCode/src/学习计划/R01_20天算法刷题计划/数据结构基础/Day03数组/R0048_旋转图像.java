package 学习计划.R01_20天算法刷题计划.数据结构基础.Day03数组;

/**
 * @author Ren
 */

public class R0048_旋转图像 {

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        // 沿对角线(右上-左下)翻转
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[len - j-1][len-1-i];
                matrix[len - j-1][len-1-i] = t;
            }
        }
        // 上下对称翻转
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[len -1- i][j];
                matrix[len -1- i][j] = t;
            }
        }
    }
}
