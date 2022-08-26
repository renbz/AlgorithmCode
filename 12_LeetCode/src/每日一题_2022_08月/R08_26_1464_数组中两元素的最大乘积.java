package 每日一题_2022_08月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/26 23:22
 * @Description:
 */

public class R08_26_1464_数组中两元素的最大乘积 {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

}
