package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/20 13:46
 * @Description:
 */

public class 剑指OfferII_094_最少回文分割 {

    /**
     * 当前字符串长度为[0,i]时，如果存在0<j<i && [j,i]是回文串的话，
     * 那么dp[i]=Math.min(dp[i],dp[j]+1);
     */
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
            for (int j = 0; j < i; j++) {
                if (valid(s, j, i - 1)) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n] - 1;
    }

    public boolean valid(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

}
