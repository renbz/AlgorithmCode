package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/17 09:08
 * @Description:
 */

public class R12_17_1518_换酒问题 {
    public int numWaterBottles(int n, int m) {
        int count = n + n / (m - 1);
        return n % (m - 1) == 0 ? count - 1 : count;
    }
}
