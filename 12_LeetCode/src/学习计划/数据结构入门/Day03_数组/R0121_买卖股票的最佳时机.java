package 学习计划.数据结构入门.Day03_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/20 11:52
 * @Description:
 */

public class R0121_买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > res) {
                res = prices[i] - minPrice;
            }
        }
        return res;
    }

}
