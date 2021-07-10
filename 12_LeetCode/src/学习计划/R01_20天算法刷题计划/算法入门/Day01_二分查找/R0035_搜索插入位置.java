package 学习计划.R01_20天算法刷题计划.算法入门.Day01_二分查找;

/**
 * @author Ren
 */

public class R0035_搜索插入位置 {

    public int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return nums[right] < target ? right + 1 : left;
    }

}
