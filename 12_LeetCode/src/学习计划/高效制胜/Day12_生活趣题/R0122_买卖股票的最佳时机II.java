package 学习计划.高效制胜.Day12_生活趣题;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/14 11:24
 * @Description:
 */

public class R0122_买卖股票的最佳时机II {

    public int maxProfit(int[] prices) {
        int ans = 0, last = prices[0], len = prices.length;
        for (int i = 1; i < len; i++) {
            if (prices[i] > last) {
                ans += prices[i] - last;
            }
            last = prices[i];
        }
        return ans;
    }

}
