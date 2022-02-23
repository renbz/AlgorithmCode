package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/23 21:47
 * @Description:
 */

public class 剑指OfferII_102_加减的目标值 {

    int ans = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return ans;
    }

    private void backtrack(int[] nums, int target, int i, int sum) {
        if (i == nums.length) {
            if (sum == target) ans++;
        } else {
            backtrack(nums, target, i + 1, sum + nums[i]);
            backtrack(nums, target, i + 1, sum - nums[i]);
        }
    }

}
