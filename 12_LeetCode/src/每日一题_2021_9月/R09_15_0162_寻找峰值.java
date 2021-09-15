package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_15_0162_寻找峰值 {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            if (i - 1 >= 0) {
                if (nums[i - 1] >= nums[i]) ok = false;
            }
            if (i + 1 < n) {
                if (nums[i + 1] >= nums[i]) ok = false;
            }
            if (ok) return i;
        }
        return -1;
    }
}
