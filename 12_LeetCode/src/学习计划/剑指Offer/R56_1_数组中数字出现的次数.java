package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R56_1_数组中数字出现的次数 {
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        int[] res = new int[2];
        for (int num : nums) {
            sum ^= num;
        }


        int lowbit = sum & (-sum);

        for (int num : nums) {
            if ((num & lowbit) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }
}
