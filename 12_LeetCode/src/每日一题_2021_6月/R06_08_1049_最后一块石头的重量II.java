package 每日一题_2021_6月;

/**
 * @author Ren
 */

public class R06_08_1049_最后一块石头的重量II {
    public int lastStoneWeightII(int[] stones) {

        // 求出总和sum   背包问题能组成sum/2 则结果为sum-(sum/2)*2 = 1或0
        if(stones.length==1) return stones[0];
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int n = sum / 2;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= stones.length; i++) {
            int t = stones[i-1];
            for (int j = n; j >= 1; j--) {
                if (j >= t) {
                    dp[j] = Math.max(dp[j],dp[j - t] + t);
                    if (dp[j] == n) return sum - 2 * n;
                }
            }
        }
        //遍历dp数组，寻找出最接近sum/2的那个值
        for (int i = n; i >= 0; i--) {
            if (dp[i] != 0) return sum - 2 * dp[i];
        }
        return 0;
    }
}
