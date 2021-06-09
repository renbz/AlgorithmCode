package java_2013_A;

/**
 * @author Ren
 */

import java.util.*;

public class Main009_剪格子 {
    static int n, m , min=9999;
    static int[][] a;
    static long sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                sum += a[i][j];
            }
        }
        boolean[][] b = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = true;
            }
        }
        b[0][0] = false;
        dfs(0, 0, 1, a[0][0], b);
        System.out.println(min);
    }
    private static void dfs(int i, int j, int counts, int sum_part, boolean[][] b) {
        if (sum_part == sum / 2) {
            if(counts<min) min=counts;
        }

        if (i + 1 < n && b[i + 1][j] && sum_part < sum / 2) {
            b[i+1][j] = false;
            dfs(i + 1, j, counts + 1, sum_part + a[i + 1][j], b);
            b[i+1][j] = true;
        }

        if (j + 1 < m && b[i][j + 1] && sum_part < sum / 2) {
            b[i][j+1] = false;
            dfs(i, j + 1, counts + 1, sum_part + a[i][j + 1], b);
            b[i][j+1] = true;
        }
        if (i - 1 >= 0 && b[i - 1][j]&& sum_part < sum / 2) {
            b[i-1][j] = false;
            dfs(i - 1, j, counts + 1, sum_part + a[i - 1][j], b);
            b[i-1][j] = true;
        }
        if (j - 1 >= 0 && b[i][j - 1] && sum_part < sum / 2) {
            b[i][j-1] = false;
            dfs(i, j - 1, counts + 1, sum_part + a[i][j - 1], b);
            b[i][j-1] = true;
        }
    }
}
