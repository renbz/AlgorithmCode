package 每日一题_2022_09月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/3 22:34
 * @Description:
 */

public class R09_03_0646_最长数对链 {

    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}
