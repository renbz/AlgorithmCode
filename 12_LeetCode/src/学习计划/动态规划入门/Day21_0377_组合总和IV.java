package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 21:15
 * @Description:
 */

public class Day21_0377_组合总和IV {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= i) dp[i] += dp[i - nums[j]];
            }
        }
        return dp[target];
    }

}
