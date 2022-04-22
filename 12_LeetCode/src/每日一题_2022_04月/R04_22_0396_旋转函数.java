package 每日一题_2022_04月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/22 14:56
 * @Description:
 */

public class R04_22_0396_旋转函数 {

    public int maxRotateFunction(int[] nums) {
        int f = 0, n = nums.length, numSum = Arrays.stream(nums).sum();
        for (int i = 0; i < n; i++) {
            f += i * nums[i];
        }
        int res = f;
        for (int i = n - 1; i > 0; i--) {
            f += numSum - n * nums[i];
            res = Math.max(res, f);
        }
        return res;
    }

}
