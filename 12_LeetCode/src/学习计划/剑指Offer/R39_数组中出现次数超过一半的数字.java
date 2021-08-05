package 学习计划.剑指Offer;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R39_数组中出现次数超过一半的数字 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
