package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/15 20:22
 * @Description:
 */

public class R03_15_2044_统计按位或能得到最大值的子集数目 {

    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, cnt = 0;
        for (int i = 0; i < 1 << nums.length; i++) {
            int orVal = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) {
                    orVal |= nums[j];
                }
            }
            if (orVal > maxOr) {
                maxOr = orVal;
                cnt = 1;
            } else if (orVal == maxOr) {
                cnt++;
            }
        }
        return cnt;
    }
}
