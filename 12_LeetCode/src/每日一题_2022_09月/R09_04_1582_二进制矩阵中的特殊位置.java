package 每日一题_2022_09月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/4 16:10
 * @Description:
 */

public class R09_04_1582_二进制矩阵中的特殊位置 {

    public int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] rowsSum = new int[m];
        int[] colsSum = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowsSum[i] += mat[i][j];
                colsSum[j] += mat[i][j];
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rowsSum[i] == 1 && colsSum[j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }

}
