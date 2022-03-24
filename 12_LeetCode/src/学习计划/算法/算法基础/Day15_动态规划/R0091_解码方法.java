package 学习计划.算法.算法基础.Day15_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 20:48
 * @Description:
 */

public class R0091_解码方法 {

    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            if (s.charAt(i - 1) != 0) {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }

}
