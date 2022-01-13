package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/12 19:37
 * @Description:
 */

public class Day06_1567_乘积为正数的最长子数组长度 {

    public int getMaxLen(int[] nums) {
        int len = nums.length;
        int[] dpZ = new int[nums.length];  //乘积为正数的长度
        int[] dpF = new int[nums.length];  //乘积为负数的长度
        if (nums[0] > 0) dpZ[0] = 1;
        if (nums[0] < 0) dpF[0] = 1;
        int ans = dpZ[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] > 0) {
                dpZ[i] = dpZ[i - 1] + 1;
                dpF[i] = dpF[i - 1] > 0 ? dpF[i - 1] + 1 : 0;
            } else if (nums[i] < 0) {
                dpZ[i] = dpF[i - 1] > 0 ? dpF[i - 1] + 1 : 0;
                dpF[i] = dpZ[i - 1] + 1;
            } else {
                dpZ[i] = dpF[i] = 0;
            }
            ans = Math.max(ans, dpZ[i]);
        }
        return ans;
    }

}
