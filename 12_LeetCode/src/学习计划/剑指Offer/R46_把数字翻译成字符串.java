package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R46_把数字翻译成字符串 {

    /**
     * 动态规划解题
     *
     * @param num
     * @return
     */
    public int translateNum(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        int dp[] = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i <len; i++) {
            dp[i + 1] = dp[i];
            String pre = str.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
                dp[i + 1] = dp[i] + dp[i - 1];
            }
        }
        return dp[len];
    }
}
