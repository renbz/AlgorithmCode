package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R53_1_在排序数组中查找数字I {

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */

    int midIndex = 0, leftIndex = 0, rightIndex;

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                midIndex = mid;
                break;
            } else if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        if (midIndex == 0) return 0;
        searchRightIndex(nums, target, midIndex, r);
        searchLeftIndex(nums, target, l, midIndex);

        return rightIndex - leftIndex + 1;
    }

    private void searchLeftIndex(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                leftIndex = mid;
                searchLeftIndex(nums, target, l, mid-1);
            } else {
                searchLeftIndex(nums, target, mid+1, r);
            }
        }
    }

    private void searchRightIndex(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                rightIndex = mid;
                searchLeftIndex(nums, target, mid+1, r);
            } else {
                searchRightIndex(nums, target, l, mid-1);
            }
        }
    }
}
