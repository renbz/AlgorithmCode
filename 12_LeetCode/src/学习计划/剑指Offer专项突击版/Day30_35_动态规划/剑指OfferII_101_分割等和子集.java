package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/27 22:35
 * @Description:
 */

public class 剑指OfferII_101_分割等和子集 {

    public boolean canPartition(int[] nums) {
        int n = nums.length, sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            for (int j = target; j >= 0; j--) {
                if (j >= t) dp[j] = Math.max(dp[j], dp[j - t] + t);
                else dp[j] = dp[j];
            }
        }
        return dp[target] == target;
    }

}
