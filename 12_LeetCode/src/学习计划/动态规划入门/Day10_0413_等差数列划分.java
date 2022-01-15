package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/14 15:09
 * @Description:
 */

public class Day10_0413_等差数列划分 {

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int len = nums.length;
        int d = nums[1] - nums[0], ans = 0, count = 0;
        for (int i = 2; i < len; i++) {
            if (nums[i] - nums[i - 1] == d) {
                ans += (++count);
            } else {
                count = 0;
                d = nums[i] - nums[i - 1];
            }
        }
        return ans;
    }

}
