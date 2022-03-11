package 学习计划.高效制胜.Day09_字符串搜索;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 23:29
 * @Description:
 */

public class R1392_最长快乐前缀 {

    public String longestPrefix(String s) {
        int n = s.length();
        int[] fail = new int[n];
        Arrays.fill(fail, -1);
        for (int i = 1; i < n; i++) {
            int j = fail[i - 1];
            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
                j = fail[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        return s.substring(0, fail[n - 1] + 1);
    }

}
