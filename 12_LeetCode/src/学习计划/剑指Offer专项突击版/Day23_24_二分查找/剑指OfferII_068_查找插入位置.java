package 学习计划.剑指Offer专项突击版.Day23_24_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/11 19:38
 * @Description:
 */

public class 剑指OfferII_068_查找插入位置 {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = l + (r - l) / 2;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return nums[mid] < target ? mid + 1 : mid;
    }

}
