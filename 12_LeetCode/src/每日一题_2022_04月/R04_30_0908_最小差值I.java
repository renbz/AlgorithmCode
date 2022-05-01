package 每日一题_2022_04月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/30 00:08
 * @Description:
 */

public class R04_30_0908_最小差值I {

    public int smallestRangeI(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        return max - min <= 2 * k ? 0 : max - min - 2 * k;
    }

}
