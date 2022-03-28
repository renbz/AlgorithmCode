package 学习计划.编程能力.编程能力入门.Day06_07_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/28 15:14
 * @Description:
 */

public class R0283_移动零 {

    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            while (nums[left] != 0 && left < right) {
                left++;
            }

            if (nums[right] != 0) {
                swap(nums, left, right);
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
