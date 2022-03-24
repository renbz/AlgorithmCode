package 学习计划.算法.算法入门.Day03_双指针;

/**
 * @author Ren
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
