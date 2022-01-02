package 学习计划.算法基础.Day12_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 21:45
 * @Description:
 */

public class R0213_打家劫舍II {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        else if (len == 2) return Math.max(nums[0], nums[1]);
        return Math.max(robRange(nums, 0, len - 2), robRange(nums, 1, len - 1));
    }

    private int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
