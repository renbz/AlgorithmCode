package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/14 16:11
 * @Description:
 */

public class R04_14_1672_最富有客户的资产总量 {

    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            res = Math.max(res, sum);
            sum = 0;
        }
        return res;
    }

}
