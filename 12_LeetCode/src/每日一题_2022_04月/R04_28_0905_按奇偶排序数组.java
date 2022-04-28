package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/28 12:42
 * @Description:
 */

public class R04_28_0905_按奇偶排序数组 {

    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            while (nums[l] % 2 == 0 && l < r) l++;
            while (nums[r] % 2 == 1 && l < r) r--;
            //交换
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
        return nums;
    }

}
