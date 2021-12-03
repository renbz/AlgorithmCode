package 每日一题_2021_12月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/3 09:34
 * @Description:
 */

public class R12_03_1005_K次取反后最大化的数组和 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // 贪心：如果是负数，而k还有盈余，就把负数反过来
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        // 如果k没剩，那说明能转的负数都转正了，已经是最大和，返回sum
        // 如果k有剩，说明负数已经全部转正，所以如果k还剩偶数个就自己抵消掉，不用删减，如果k还剩奇数个就减掉2倍最小正数。
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}