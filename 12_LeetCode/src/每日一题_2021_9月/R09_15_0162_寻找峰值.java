package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_15_0162_寻找峰值 {

    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]>nums[i-1] && nums[i]<nums[i+1]) return i;
        }
        return -1;
    }
}
