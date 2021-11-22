package 每日一题_2021_11月;

/**
 * @author Ren
 */

public class R11_22_0384_打乱数组 {


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

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int[] param_1 = obj.reset();
     * int[] param_2 = obj.shuffle();
     */
}
