package 学习计划.算法.算法基础.Day16_动态规划;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 21:15
 * @Description:
 */

public class R0300_最长递增子序列 {

    public int lengthOfLIS(int[] nums) {
        int ans = 1;
        int[] dp = new int[nums.length];
        // 初始化数组
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j + 1]);
                ans = ans > dp[j] ? ans : dp[j];
            }
        }
        return ans;
    }
}
