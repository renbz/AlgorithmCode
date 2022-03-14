package 学习计划.高效制胜.Day10_图;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/13 23:29
 * @Description:
 */

public class R0787_K站中转内最便宜的航班 {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INF = 10000 * 101 + 1;
        int[][] f = new int[k + 2][n];
        for (int i = 0; i < k + 2; i++) {
            Arrays.fill(f[i], INF);
        }
        f[0][src] = 0;
        for (int t = 1; t <= k + 1; t++) {
            for (int[] flight : flights) {
                int j = flight[0], i = flight[1], cost = flight[2];
                f[t][i] = Math.min(f[t][i], f[t - 1][j] + cost);
            }
        }
        int ans = INF;
        for (int t = 1; t <= k + 1; ++t) {
            ans = Math.min(ans, f[t][dst]);
        }
        return ans == INF ? -1 : ans;
    }

}
