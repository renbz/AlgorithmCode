package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/23 22:56
 * @Description:
 */

public class 剑指OfferII_104_排列的数目 {

    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) dp[nums[i]] = 1;
        }
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) dp[i] += dp[i - nums[j]];
            }
        }
        return dp[target];
    }

}
