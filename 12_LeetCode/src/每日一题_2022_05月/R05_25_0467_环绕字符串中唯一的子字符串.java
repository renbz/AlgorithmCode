package 每日一题_2022_05月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/25 23:55
 * @Description:
 */

public class R05_25_0467_环绕字符串中唯一的子字符串 {

    public int findSubstringInWraproundString(String p) {
        int[] dp = new int[26];
        int k = 0;
        for (int i = 0; i < p.length(); ++i) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) + 26) % 26 == 1) { // 字符之差为 1 或 -25
                ++k;
            } else {
                k = 1;
            }
            dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], k);
        }
        return Arrays.stream(dp).sum();
    }

}
