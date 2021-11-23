package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R53_1_在排序数组中查找数字I {


    public static void main(String[] args) {
        R53_1_在排序数组中查找数字I obj = new R53_1_在排序数组中查找数字I();
        int[] a = new int[]{2, 2};
        int search = obj.search(a, 2);
        System.out.println(search);
    }

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
