package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/1 17:39
 * @Description:
 */

public class R02_01_1763_最长的美好子字符串 {

    public String longestNiceSubstring(String s) {
        int n = s.length(), idx = -1, len = 0;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (c >= 'a' && c <= 'z') a |= (1 << (c - 'a'));
                else b |= (1 << (c - 'A'));
                if (a == b && j - i + 1 > len) {
                    idx = i;
                    len = j - i + 1;
                }
            }
        }
        return idx == -1 ? "" : s.substring(idx, idx + len);
    }

}
