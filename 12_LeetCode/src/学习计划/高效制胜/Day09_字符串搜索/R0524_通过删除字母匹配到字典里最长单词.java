package 学习计划.高效制胜.Day09_字符串搜索;

import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 23:20
 * @Description:
 */

public class R0524_通过删除字母匹配到字典里最长单词 {

    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for (String t : dictionary) {
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) i++;
                j++;
            }
            if (i == t.length()) {
                if (t.length() > ans.length()) ans = t;
                if (t.length() == ans.length()) ans = ans.compareTo(t) < 0 ? ans : t;
            }
        }
        return ans;
    }

}
