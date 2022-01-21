package 学习计划.动态规划入门;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/20 17:58
 * @Description:
 */

public class Day18_0300_最长递增子序列 {

    public int lengthOfLIS(int[] nums) {
        int ans = 1, len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
                ans = Math.max(ans, dp[i]);
            }
        }
        return ans;
    }

}
