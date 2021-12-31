package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 09:35
 * @Description:
 */

public class LCP28_采购方案 {

    public int purchasePlans(int[] nums, int target) {
        int MOD = 1000000007;
        Arrays.sort(nums);
        int l = 0, r = nums.length-1, ans = 0;
        while (l < r) {
            if (nums[l] + nums[r] > target) r--;
            else {
                ans += r - l;
                ans = ans > MOD ? ans % MOD : ans;
                l++;
            }
        }
        return ans % MOD;
    }

}
