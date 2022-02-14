package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/14 00:06
 * @Description:
 */

public class R02_14_0540_有序数组中的单一元素 {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for (int num : nums) ans ^= num;
        return ans;
    }
}
