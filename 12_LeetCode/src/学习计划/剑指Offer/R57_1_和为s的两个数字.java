package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R57_1_和为s的两个数字 {

    public int[] twoSum(int[] nums, int target) {

        int i = 0, j = nums.length;
        int sum = 0;
        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum == target) return new int[]{nums[i], nums[j]};
            if (sum < target) i++;
            if (sum > target) j--;
        }
        return new int[]{0, 0};
    }

}
