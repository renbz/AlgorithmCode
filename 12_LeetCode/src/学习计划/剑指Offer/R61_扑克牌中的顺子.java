package 学习计划.剑指Offer;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 15:28
 * @Description:
 */

public class R61_扑克牌中的顺子 {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count0 = 0, count1 = 0;
        // 获取0的数量
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) count0++;

            if (nums[i] != 0) {
                if (nums[i + 1] == nums[i]) return false;
                count1 += nums[i + 1] - nums[i] - 1;
            }
            if (count1 < 0) return false;
        }
        return count0 == count1;
    }
}

