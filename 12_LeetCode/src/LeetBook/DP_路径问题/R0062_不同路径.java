package LeetBook.DP_路径问题;

/**
 * @author Ren
 */

public class R0062_不同路径 {

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[n + 1][m + 1];
        arr[0][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[n][m];
    }

}
