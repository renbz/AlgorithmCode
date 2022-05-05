package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/5 08:33
 * @Description:
 */

public class R05_05_0713_乘积小于K的子数组 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ans = 0;
        int prod = 1, i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            ans += j - i + 1;
        }
        return ans;
    }

}
