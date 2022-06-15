package 每日一题_2022_06月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/15 21:30
 * @Description:
 */

public class R06_15_0719_找出第K小的数对距离 {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, left = 0, right = nums[n - 1] - nums[0];
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            for (int i = 0, j = 0; j < n; j++) {
                while (nums[j] - nums[i] > mid) {
                    i++;
                }
                cnt += j - i;
            }
            if (cnt >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
