package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R49_丑数 {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int dp[] = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int a2 = dp[a] * 2, a3 = dp[b] * 3, a5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(a2, a3), a5);
            if (dp[i] == a2) a++;
            if (dp[i] == a3) b++;
            if (dp[i] == a5) c++;
        }
        return dp[n - 1];
    }
}
