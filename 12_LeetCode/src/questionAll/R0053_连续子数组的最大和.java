package questionAll;

/**
 * @author Ren
 */

public class R0053_连续子数组的最大和 {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            max = max > nums[i] ? max : nums[i];
        }
        return max;
    }

}
