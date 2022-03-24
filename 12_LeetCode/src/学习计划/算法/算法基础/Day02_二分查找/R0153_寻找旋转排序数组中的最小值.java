package 学习计划.算法.算法基础.Day02_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 15:37
 * @Description:
 */

public class R0153_寻找旋转排序数组中的最小值 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
