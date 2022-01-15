package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/15 14:59
 * @Description:
 */

public class R01_15_计算力扣银行的钱 {

    public int totalMoney(int n) {
        int t = n / 7, sum = 0;
        sum += 7 * (7 + t) * t / 2;
        for (int i = 1; i <= n % 7; i++) {
            sum += t + i;
        }
        return sum;
    }

}
