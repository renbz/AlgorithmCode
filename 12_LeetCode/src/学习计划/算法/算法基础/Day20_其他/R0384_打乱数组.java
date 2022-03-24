package 学习计划.算法.算法基础.Day20_其他;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/3 10:22
 * @Description:
 */

public class R0384_打乱数组 {

    class Solution {
        int[] origin;

        public Solution(int[] nums) {
            origin = nums;

        }

        public int[] reset() {
            return origin;
        }

        public int[] shuffle() {
            int[] clone = origin.clone();
            int n = clone.length;
            while (n > 1) {
                swap(clone, (int) (Math.random() * n), --n);
            }
            return clone;

        }

        public void swap(int[] nums, int l, int r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
    }

}
