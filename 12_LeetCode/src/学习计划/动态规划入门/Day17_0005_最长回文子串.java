package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/19 14:27
 * @Description:
 */

public class Day17_0005_最长回文子串 {

    /**
     * 使用中心扩展法，扩展时 要区分中心的奇偶性
     *
     * @param s
     * @return
     */
    String s;

    public String longestPalindrome(String s) {
        this.s = s;
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(i, i);
            int len2 = expandAroundCenter(i, i + 1);
            int len = Math.max(len1, len2);
            // i为中心
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }

}
