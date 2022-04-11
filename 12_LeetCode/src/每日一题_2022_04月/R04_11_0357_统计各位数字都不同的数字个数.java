package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/11 21:46
 * @Description:
 */

public class R04_11_0357_统计各位数字都不同的数字个数 {

    public int countNumbersWithUniqueDigits(int n) {
        // 统计各数位中 各个数字都不相同的数字的个数
        if (n == 0) return 1;
        if (n == 1) return 10;
        int res = 10, cur = 9;
        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            res += cur;
        }
        return res;
    }

}
