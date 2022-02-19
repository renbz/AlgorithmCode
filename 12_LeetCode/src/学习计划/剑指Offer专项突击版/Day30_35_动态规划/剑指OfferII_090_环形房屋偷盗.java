package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 21:28
 * @Description:
 */

public class 剑指OfferII_090_环形房屋偷盗 {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 3) return Arrays.stream(nums).max().getAsInt();
        return Math.max(dynamic(nums, 0, n - 2), dynamic(nums, 1, n - 1));
    }

    private int dynamic(int[] nums, int l, int r) {
        int[] dp = new int[r + 1];
        dp[l] = nums[l];
        dp[l + 1] = Math.max(nums[l], nums[l + 1]);
        for (int i = l + 2; i <= r; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[r];
    }

}
