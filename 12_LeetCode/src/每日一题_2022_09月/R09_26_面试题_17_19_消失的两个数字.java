package 每日一题_2022_09月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/26 19:33
 * @Description:
 */

public class R09_26_面试题_17_19_消失的两个数字 {

    public int[] missingTwo(int[] nums) {
        int n = nums.length + 2, cur = n * (1 + n) / 2;
        for (int num : nums) {
            cur -= num;
        }
        int sum = cur, t = cur / 2;
        cur = t * (1 + t) / 2;
        for (int num : nums) {
            if (num <= t) {
                cur -= num;
            }
        }
        return new int[]{cur, sum - cur};
    }

}
