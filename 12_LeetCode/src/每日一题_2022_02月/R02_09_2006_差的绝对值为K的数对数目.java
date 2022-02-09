package 每日一题_2022_02月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/9 08:54
 * @Description:
 */

public class R02_09_2006_差的绝对值为K的数对数目 {

    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 0, len = nums.length, ans = 0;
        while (l < len) {
            r = l;
            while (r < len) {
                if (Math.abs(nums[l] - nums[r]) == k) {
                    ans++;
                    r++;
                } else if (Math.abs(nums[l] - nums[r]) < k) {
                    r++;
                } else break;
            }
            l++;
        }
        return ans;
    }

}
