package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/4 09:37
 * @Description:
 */

public class R03_04_2104_子数组范围和 {

    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ret = 0;
        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                ret += maxVal - minVal;
            }
        }
        return ret;
    }

}
