package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R21_调整数组顺序使奇数位于偶数前面 {

    public int[] exchange(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            while (nums[l] % 2 == 1 && l<r) l++;
            while (nums[r] % 2 == 0 && l<r) r--;

            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }
        return nums;
    }

}
