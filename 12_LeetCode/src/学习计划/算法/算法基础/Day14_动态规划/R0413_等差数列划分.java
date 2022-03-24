package 学习计划.算法.算法基础.Day14_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 20:36
 * @Description:
 */

public class R0413_等差数列划分 {

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int d = nums[1] - nums[0];
        int cnt = 0, ans = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == d) {
                cnt++;
                ans += cnt;
            } else {
                cnt = 0;
                d = nums[i] - nums[i - 1];
            }
        }
        return ans;
    }
}
