package 每日一题_2022_10月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/7 20:06
 * @Description:
 */

public class R10_07_1800_最大升序子数组和 {

    public int maxAscendingSum(int[] nums) {
        int res = 0;
        int l = 0;
        while (l < nums.length) {
            int cursum = nums[l++];
            while (l < nums.length && nums[l] > nums[l - 1]) {
                cursum += nums[l++];
            }
            res = Math.max(res, cursum);
        }
        return res;
    }

}
