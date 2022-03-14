package 学习计划.高效制胜.Day12_生活趣题;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/14 10:34
 * @Description:
 */

public class R0121_买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int min = prices[0], ans = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            ans = Math.max(ans, price - min);
        }
        return ans;
    }

}
