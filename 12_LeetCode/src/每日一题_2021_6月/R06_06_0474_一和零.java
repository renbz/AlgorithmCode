package 每日一题_2021_6月;

/**
 * @author Ren
 */

public class R06_06_0474_一和零 {

    public int findMaxForm(String[] strs, int m, int n) {

        int zero = 0;
        int one = 0;
        for (String s : strs) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') zero++;
                else one++;
            }
        }
        if (zero < m && one < n) return strs.length;

        //三维背包问题,m个0，n个1
        int len = strs.length;
        int[][][] dp = new int[len + 1][m + 1][n + 1];


        //动态规划，三层for循环
        for (int i = 1; i < len + 1; i++) {
            int c0 = 0, c1 = 0;
            for (int j = 0; j < strs[i-1].length(); j++) {
                if (strs[i-1].charAt(j) == '0') {
                    c0++;
                } else {
                    c1++;
                }
            }
            for (int j = 0; j < m + 1; j++) {
                for (int k = 0; k < n + 1; k++) {
                    // 先把上一行抄下来
                    dp[i][j][k] = dp[i - 1][j][k];
                    int zeros = c0;
                    int ones = c1;
                    if (j >= zeros && k >= ones) {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - zeros][k - ones] + 1);
                    }
                }
            }
        }
        return dp[len][m][n];
    }
}
