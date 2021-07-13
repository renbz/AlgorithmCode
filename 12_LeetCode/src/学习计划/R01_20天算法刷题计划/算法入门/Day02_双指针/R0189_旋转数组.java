package 学习计划.R01_20天算法刷题计划.算法入门.Day02_双指针;

/**
 * @author Ren
 */

public class R0189_旋转数组 {


    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1); // 翻转所有元素
        reverse(nums, 0, k - 1); // 翻转 0 - k
        reverse(nums, k, nums.length - 1); // 翻转 k - n-1
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }

}
