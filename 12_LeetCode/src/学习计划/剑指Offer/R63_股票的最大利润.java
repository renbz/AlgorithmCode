package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 16:31
 * @Description:
 */

public class R63_股票的最大利润 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, ans = 0, len = prices.length;
        for (int i = 0; i < len; i++) {
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }

}
