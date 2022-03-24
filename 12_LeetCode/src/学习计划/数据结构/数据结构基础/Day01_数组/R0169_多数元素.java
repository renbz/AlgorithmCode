package 学习计划.数据结构.数据结构基础.Day01_数组;

/**
 * @author Ren
 */

public class R0169_多数元素 {

    public int majorityElement(int[] nums) {
        int count = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) ans = nums[i];
            count += ans == nums[i] ? 1 : -1;
        }
        return ans;
    }
}
