package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/17 13:07
 * @Description:
 */

public class R01_17_1220_统计元音字母序列的数目 {

    public int countVowelPermutation(int n) {
        int MOD = 1000000000 + 7;
        long[] count = new long[]{1, 1, 1, 1, 1};
        long cnt_a = 0, cnt_e = 0, cnt_i = 0, cnt_o = 0, cnt_u = 0;
        for (int i = 2; i <= n; i++) {
            cnt_a = (count[1] + count[2] + count[4]) % MOD;
            cnt_e = (count[0] + count[2]) % MOD;
            cnt_i = (count[1] + count[3]) % MOD;
            cnt_o = count[2] % MOD;
            cnt_u = (count[2] + count[3]) % MOD;
            count[0] = cnt_a;
            count[1] = cnt_e;
            count[2] = cnt_i;
            count[3] = cnt_o;
            count[4] = cnt_u;
        }
        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            ans+=count[i];
            ans%=MOD;
        }
        return ans;
    }

}
