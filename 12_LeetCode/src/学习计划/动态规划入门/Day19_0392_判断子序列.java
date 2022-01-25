package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 20:45
 * @Description:
 */

public class Day19_0392_判断子序列 {

    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if (s.length() > t.length()) return false;
        int s_index = 0, t_index = 0, s_len = s.length(), t_len = t.length();
        while (t_index < t_len) {
            if (s.charAt(s_index) == t.charAt(t_index)) {
                s_index++;
            }
            if (s_index == s_len) return true;
            t_index++;
        }
        return false;
    }
}
