package 学习计划.数据结构.数据结构入门.Day01_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 11:40
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
