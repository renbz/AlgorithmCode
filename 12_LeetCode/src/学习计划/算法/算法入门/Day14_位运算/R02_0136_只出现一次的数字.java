package 学习计划.算法.算法入门.Day14_位运算;

/**
 * @author Ren
 */

public class R02_0136_只出现一次的数字 {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

}
