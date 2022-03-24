package 学习计划.算法.算法基础.Day05_滑动窗口;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 19:47
 * @Description:
 */

public class R0209_长度最小的子数组 {

    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = 0, sum = 0, min = Integer.MAX_VALUE;
        while (r < nums.length) {
            sum += nums[r++];
            while (sum >= s) {
                min = Math.min(min, r - l);
                sum -= nums[l++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
