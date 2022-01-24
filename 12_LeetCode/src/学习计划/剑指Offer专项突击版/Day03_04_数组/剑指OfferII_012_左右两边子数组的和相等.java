package 学习计划.剑指Offer专项突击版.Day03_04_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 18:33
 * @Description:
 */

public class 剑指OfferII_012_左右两边子数组的和相等 {

    public int pivotIndex(int[] nums) {
        // 前缀和+遍历
        int len = nums.length;
        if (len == 1) return 0;
        for (int i = 1; i < len; i++) {
            nums[i] += nums[i - 1];
        }
        // 左端点为中心的情况处理
        if (nums[len - 1] - nums[0] == 0) return 0;
        for (int i = 1; i < len; i++) {
            if (nums[len - 1] - nums[i] == nums[i - 1]) return i;
        }
        // 右端点为中心的情况处理
        if (nums[len - 2] == 0) return len - 1;
        return -1;
    }

}
