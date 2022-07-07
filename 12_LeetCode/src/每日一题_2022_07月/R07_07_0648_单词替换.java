package 每日一题_2022_07月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/7 12:20
 * @Description:
 */

public class R07_07_0648_单词替换 {

    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder ans = new StringBuilder();
        final String[] words = sentence.split(" ");
        Collections.sort(dictionary);
        for (String word : words) {
            StringBuilder t = new StringBuilder();
            for (String s : dictionary) {
                int d_l = s.length(), w_l = word.length();
                if (w_l >= d_l && word.substring(0, d_l).equals(s)) {
                    t = new StringBuilder(s);
                    break;
                } else {
                    continue;
                }
            }
            if (t.length() > 0) {
                ans.append(t).append(" ");
            } else {
                ans.append(word).append(" ");
            }
        }
        return ans.toString().substring(0, ans.length() - 1);
    }

}
