package 学习计划.高效制胜.Day04_动态规划法;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 21:45
 * @Description:
 */

public class R0406_分割等和子集 {

    public boolean canPartition(int[] nums) {
        int len = nums.length, sum = 0;
        for (int num : nums) sum += num;
        // 和为奇数
        if ((sum & 1) == 1) return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        if (nums[0] < target) dp[nums[0]] = true;
        for (int i = 1; i < len; i++) {
            for (int j = target; j >= 0 && nums[i] <= j; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
            if (dp[target]) return true;
        }
        return dp[target];
    }

}
