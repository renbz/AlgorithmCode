package 每日一题_2022_05月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/19 16:06
 * @Description:
 */

public class R05_19_0462_最少移动次数使数组元素相等II {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ans = 0, x = nums[n / 2];
        for (int i = 0; i < n; i++) ans += Math.abs(nums[i] - x);
        return ans;
    }

}
