package 每日一题_2022_07月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/8 23:53
 * @Description:
 */

public class R07_08_1217_玩筹码 {

    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int pos : position) {
            if ((pos & 1) != 0) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }

}
