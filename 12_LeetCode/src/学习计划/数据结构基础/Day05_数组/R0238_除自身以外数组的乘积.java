package 学习计划.数据结构基础.Day05_数组;

/**
 * @author Ren
 */

public class R0238_除自身以外数组的乘积 {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = 1;
        // 元素前缀相乘 放入数组
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        // 在前缀相乘的基础上 乘以 后缀相乘
        int t = 1;
        for (int i = len - 2; i >= 0; i--) {
            t = t * nums[i + 1];
            ans[i] = ans[i] * t;
        }
        return ans;
    }

}
