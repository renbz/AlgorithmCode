package 学习计划.算法入门.Day02_双指针;

/**
 * @author Ren
 */

public class R0977_有序数组的平方 {
    public int[] sortedSquares(int[] nums) {

        //找到中间位置即: 左右指针的起始位置
        int initIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                initIndex = i;
                break;
            }
        }
        int l = initIndex - 1, r = initIndex;
        int[] ans = new int[nums.length];
        int index = 0;
        while (l >= 0 && r < nums.length) {
            if (nums[l] * nums[l] < nums[r] * nums[r]) {
                ans[index++] = nums[l] * nums[l];
                l--;
            } else {
                ans[index++] = nums[r] * nums[r];
                r++;
            }
        }
        while (l >= 0) {
            ans[index++] = nums[l] * nums[l];
            l--;
        }
        while (r < nums.length) {
            ans[index++] = nums[r] * nums[r];
            r++;
        }
        return ans;
    }

}
