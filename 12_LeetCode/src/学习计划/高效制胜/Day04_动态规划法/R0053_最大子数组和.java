package 学习计划.高效制胜.Day04_动态规划法;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 21:52
 * @Description:
 */

public class R0053_最大子数组和 {

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
