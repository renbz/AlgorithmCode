package 学习计划.算法.算法基础.Day02_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 15:43
 * @Description:
 */

public class R0162_寻找峰值 {
    public int findPeakElement(int[] nums) {
        int idx = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[idx]) {
                idx = i;
            }
        }
        return idx;
    }
}
