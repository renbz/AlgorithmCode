package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 09:07
 * @Description:
 */

public class R01_13_0747_至少是其他数字两倍的最大数 {

    public int dominantIndex(int[] nums) {
        int max = nums[0], index = 0, twoB = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                twoB = 2 * max;
                max = nums[i];
                index = i;
            } else {
                twoB = Math.max(twoB, 2 * nums[i]);
            }
        }
        return max >= twoB ? index : -1;
    }

}
