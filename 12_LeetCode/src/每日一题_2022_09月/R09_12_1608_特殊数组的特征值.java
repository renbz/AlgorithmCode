package 每日一题_2022_09月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/12 13:19
 * @Description:
 */

public class R09_12_1608_特殊数组的特征值 {

    public int specialArray(int[] nums) {
        int[] cnts = new int[1010];
        for (int x : nums) cnts[x]++;
        for (int i = 1009, tot = 0; i >= 0; i--) {
            tot += cnts[i];
            if (i == tot) return i;
        }
        return -1;
    }

}
