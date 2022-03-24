package 学习计划.算法.算法基础.Day01_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 14:59
 * @Description:
 */

public class R0033_搜索旋转排序数组 {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        if (n == 1) return nums[0] == target ? 0 : 1;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            // 如果第一个元素小于中间的元素，则 0--mid是有序的(升序)
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else { // mid--(n-1)这段的顺序是先升后降，第一个可能大于最后一个
                //有序片段
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else { //无序
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
