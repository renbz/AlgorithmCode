package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/26 19:26
 * @Description:
 */

public class R02_26_2016_增量元素之间的最大差值 {

    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1, premin = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin);
            } else {
                premin = nums[i];
            }
        }
        return ans;
    }
}
