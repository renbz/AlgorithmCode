package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 19:55
 * @Description:
 */

public class LCP36_最多牌组数 {

    int dp[][][];

    public int maxGroupNumber(int[] A) {
        Arrays.sort(A);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int j = i;
            int cnt = 0;
            while (j < A.length && A[j] == A[i]) {
                j++;
                cnt++;
            }
            list.add(new int[]{A[i], cnt});
            i = j - 1;
        }
        dp = new int[list.size()][7][7];
        init(dp);

        int res = dfs(list, 0, 0, 0);
        return res / 3;
    }

    public int dfs(List<int[]> A, int i, int a, int b) {
        if (i >= A.size()) {
            return 0;
        }
        int p[] = A.get(i);
        if (p[1] - a < 0) {
            return -1000000;
        }

        if (dp[i][a][b] != -1) return dp[i][a][b];

        int res = 0;
        if (get(A, i + 1) == p[0] + 1 && get(A, i + 2) == p[0] + 2) {//can take sequence
            for (int j = 0; j <= 2; j++) {
                if (p[1] - j - a >= 0) {
                    int cnt = (p[1] - j - a) / 3;
                    res = Math.max(res, cnt * 3 + j + dfs(A, i + 1, b + j, j));
                }
            }
        }
        res = Math.max(res, ((p[1] - a) / 3) * 3 + dfs(A, i + 1, b, 0));
        dp[i][a][b] = res + a;
        return res + a;

    }

    public int get(List<int[]> A, int i) {
        if (i >= A.size()) {
            return -1;
        }
        return A.get(i)[0];
    }

    public void init(int A[][][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int k = 0; k < A[0][0].length; k++) {
                    A[i][j][k] = -1;
                }
            }
        }
    }
}
