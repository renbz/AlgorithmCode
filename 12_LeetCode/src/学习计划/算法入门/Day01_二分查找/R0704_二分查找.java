package 学习计划.算法入门.Day01_二分查找;

/**
 * @author Ren
 */

public class R0704_二分查找 {


    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;

        while (left <= right) {
            int  mid = left + (right - left) / 2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
}
