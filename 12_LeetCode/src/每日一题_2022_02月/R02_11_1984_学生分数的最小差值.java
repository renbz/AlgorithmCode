package 每日一题_2022_02月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/11 09:11
 * @Description:
 */

public class R02_11_1984_学生分数的最小差值 {

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = l + k - 1, ans = Integer.MAX_VALUE;
        while (r < nums.length) {
            ans = Math.min(ans, nums[r++] - nums[l++]);
        }
        return ans;
    }

}
