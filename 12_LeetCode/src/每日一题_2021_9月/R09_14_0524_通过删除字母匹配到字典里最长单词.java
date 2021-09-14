package 每日一题_2021_9月;

import java.util.List;

/**
 * @author Ren
 */

public class R09_14_0524_通过删除字母匹配到字典里最长单词 {

    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String t : dictionary) {
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) i++;
                j++;
            }
            if (i == t.length()) {
                if (t.length() > res.length()) res = t;
                if (t.length() == res.length()) res = res.compareTo(t) < 0 ? res : t;
            }
        }
        return res;
    }

}
