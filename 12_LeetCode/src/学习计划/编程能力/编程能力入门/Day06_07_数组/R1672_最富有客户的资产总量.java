package 学习计划.编程能力.编程能力入门.Day06_07_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/28 15:12
 * @Description:
 */

public class R1672_最富有客户的资产总量 {

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
