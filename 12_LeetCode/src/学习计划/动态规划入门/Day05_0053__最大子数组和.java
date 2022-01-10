package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/9 11:46
 * @Description:
 */

public class Day05_0053__最大子数组和 {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], subSum = 0;
        for (int num : nums) {
            subSum = Math.max(subSum + num, num);
            maxSum = Math.max(maxSum, subSum);
        }
        return maxSum;
    }
}
