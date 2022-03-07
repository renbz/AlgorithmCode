package 学习计划.高效制胜.Day06_数字;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/7 11:22
 * @Description:
 */

public class R0483_最小好进制 {

    public String smallestGoodBase(String n) {
        long m = Long.parseLong(n);
        int max = (int) (Math.log(m) / Math.log(2) + 1);
        for (int len = max; len >= 3; len--) {
            long k = (long) Math.pow(m, 1.0 / (len - 1));
            long res = 0;
            for (int i = 0; i < len; i++) {
                res = res * k + 1;
                if (res == m) return String.valueOf(k);
            }
        }
        return String.valueOf(m - 1);
    }

}
