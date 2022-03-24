package 学习计划.算法.算法基础.Day14_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 11:52
 * @Description:
 */

public class R0005_最长回文子串 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        int maxLen = 1, begin = 0;
        //dp[i][j] 表示s[i...j] 是否是回文字符串
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) dp[i][i] = true;
        char[] charArray = s.toCharArray();
        // 注意: 左下角先填，因为当前元素要根据左下角那个得到
        for (int j = 0; j < len; j++) {
            for (int i = 0; i < j; i++) {
                dp[i][j] = (charArray[i] == charArray[j]) && (j - i < 3 || dp[i + 1][j - 1]);
                // 只要dp[i][j]==true成立，表示子串s[i...j] 是回文，此时记录回文长度和实际位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

}
