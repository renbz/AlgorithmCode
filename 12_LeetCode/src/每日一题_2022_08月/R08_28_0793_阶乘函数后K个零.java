package 每日一题_2022_08月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/28 19:04
 * @Description:
 */

public class R08_28_0793_阶乘函数后K个零 {

    public int preimageSizeFZF(int k) {
        return (int) (help(k + 1) - help(k));
    }

    public long help(int k) {
        long r = 5L * k;
        long l = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (zeta(mid) < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r + 1;
    }

    public long zeta(long x) {
        long res = 0;
        while (x != 0) {
            res += x / 5;
            x /= 5;
        }
        return res;
    }
}
