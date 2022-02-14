package 学习计划.剑指Offer专项突击版.Day25_26_排序;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/14 00:32
 * @Description:
 */

public class 剑指OfferII_076_数组中的第k大的数字 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
