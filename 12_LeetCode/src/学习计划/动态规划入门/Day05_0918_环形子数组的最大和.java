package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/9 11:46
 * @Description:
 */

public class Day05_0918_环形子数组的最大和 {

    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0], curMax = 0, minSum = nums[0], curMin = 0, totalSum = 0;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            totalSum += num;
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}
