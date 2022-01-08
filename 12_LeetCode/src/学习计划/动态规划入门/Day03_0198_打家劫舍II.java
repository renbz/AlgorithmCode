package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/7 19:50
 * @Description:
 */

public class Day03_0198_打家劫舍II {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        else if (len == 2) return Math.max(nums[0], nums[1]);
        return Math.max(robRange(nums, 0, len - 2), robRange(nums, 1, len - 1));
    }

    private int robRange(int[] nums, int start, int end) {
        int dp[] = new int[end];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }

}
