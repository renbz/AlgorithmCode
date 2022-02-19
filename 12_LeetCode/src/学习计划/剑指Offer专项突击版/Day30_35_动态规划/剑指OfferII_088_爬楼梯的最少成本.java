package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 21:16
 * @Description:
 */

public class 剑指OfferII_088_爬楼梯的最少成本 {

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        for (int i = 2; i < len; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i - 2]) + cost[i];
        }
        return Math.min(cost[len - 1], cost[len - 2]);
    }

}
