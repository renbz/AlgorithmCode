package 学习计划.剑指Offer专项突击版.Day03_04_数组;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 17:18
 * @Description:
 */

public class 剑指OfferII_008_和大于等于target的最短子数组 {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int ans = Integer.MAX_VALUE, start = 0, end = 0, sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

}
