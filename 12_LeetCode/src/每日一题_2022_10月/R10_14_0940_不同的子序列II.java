package 每日一题_2022_10月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/15 15:29
 * @Description:
 */

public class R10_14_0940_不同的子序列II {

    public int distinctSubseqII(String s) {
        final int MOD = 1000000007;
        int[] last = new int[26];
        Arrays.fill(last, -1);

        int n = s.length();
        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 26; ++j) {
                if (last[j] != -1) {
                    f[i] = (f[i] + f[last[j]]) % MOD;
                }
            }
            last[s.charAt(i) - 'a'] = i;
        }

        int ans = 0;
        for (int i = 0; i < 26; ++i) {
            if (last[i] != -1) {
                ans = (ans + f[last[i]]) % MOD;
            }
        }
        return ans;
    }

}
