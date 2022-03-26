package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/25 09:30
 * @Description:
 */

public class R03_25_0172_阶乘后的零 {

    public int trailingZeroes(int n) {
        int ans = 0;
        while (n != 0) {
            n = n / 5;
            ans += n;
        }
        return ans;
    }

}
