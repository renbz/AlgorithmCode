package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/12 20:14
 * @Description:
 */

public class Day07_0121_买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int min = prices[0], ans = 0, len = prices.length;
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }

}
