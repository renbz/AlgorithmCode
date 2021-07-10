package 学习计划.R01_20天算法刷题计划.数据结构基础.Day01_数组;

/**
 * @author Ren
 */

public class R0136_只出现一次的数字 {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
