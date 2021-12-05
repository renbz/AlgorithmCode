package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/5 09:51
 * @Description:
 */

public class R12_05_0372_超级次方 {

    static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int ans = 1;
        for (int e : b)
            ans = (int) ((long) ex2(ans, 10) * ex2(a, e) % MOD);
        return ans;
    }
    public static long ex2(long n, long m) {
        long pingfangshu = n; //n的1次方
        long result = 1;
        while (m != 0) {
            // 遇1累乘现在的幂
            if ((m & 1) == 1)
                result *= pingfangshu % MOD;
            //每移一位，幂累乘方一次
            pingfangshu *= pingfangshu % MOD;
            // 右移一位
            m >>= 1;
        }
        return result;
    }

}
