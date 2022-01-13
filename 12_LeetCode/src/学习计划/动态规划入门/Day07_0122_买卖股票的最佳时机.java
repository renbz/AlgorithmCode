package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/12 20:14
 * @Description:
 */

public class Day07_0122_买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int last = prices[0], ans = 0, len = prices.length;
        for (int i = 1; i < len; i++) {
            if (prices[i] > last) ans += prices[i] - last;
            last = prices[i];
        }
        return ans;
    }
}
