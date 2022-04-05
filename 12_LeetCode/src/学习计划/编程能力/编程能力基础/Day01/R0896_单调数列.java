package 学习计划.编程能力.编程能力基础.Day01;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/5 14:37
 * @Description:
 */

public class R0896_单调数列 {

    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
