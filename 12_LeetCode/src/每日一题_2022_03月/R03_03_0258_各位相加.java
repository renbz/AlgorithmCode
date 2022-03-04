package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/3 21:02
 * @Description:
 */

public class R03_03_0258_各位相加 {

    public int addDigits(int num) {
        if (num < 10) return num;
        int ans = 0;
        while (num != 0) {
            ans += num % 10;
            num /= 10;
        }
        return addDigits(ans);
    }
}
