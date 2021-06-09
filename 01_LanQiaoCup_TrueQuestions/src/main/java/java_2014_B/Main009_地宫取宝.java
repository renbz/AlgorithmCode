package java_2014_B;

import java.util.Scanner;

public class Main009_地宫取宝 {
    static int m, n, k;
    static int[][] a;
    static int[][][][] f = new int[51][51][14][14];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        k = in.nextInt();
        a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = in.nextInt();    // 初始化记忆型递归的数组
        }
        for (int i = 0; i < 51; i++)
            for (int j = 0; j < 51; j++)
                for (int l = 0; l < 14; l++)
                    for (int o = 0; o < 14; o++)
                        f[i][j][l][o] = -1;
        long ans = dfs(0, 0, -1, 0);
        System.out.println(ans);
    }

    private static long dfs(int i, int j, int max, int count) {
        if (f[i][j][max + 1][count] != -1) return f[i][j][max + 1][count];
        if (i == m || j == n || count > k) {
            return 0;
        }
        int cur = a[i][j], ans = 0;
        if (i == m - 1 && j == n - 1) {
            if (count == k || (count == k - 1 && cur > max))
                return 1;
            return 0;
        }
        if (cur > max) {
            ans += dfs(i, j + 1, cur, count + 1);   //  取出当前的宝藏，向右走
            ans %= 1000000007;
            ans += dfs(i + 1, j, cur, count + 1);   //  取出当前的宝藏，向下走
            ans %= 1000000007;
        }
        ans += dfs(i, j + 1, max, count);     //  不取当前宝藏，向右走
        ans %= 1000000007;
        ans += dfs(i + 1, j, max, count);     //  不取当前宝藏，向下走
        ans %= 1000000007;
        f[i][j][max + 1][count] = ans % 1000000007;
        return ans;
    }
}