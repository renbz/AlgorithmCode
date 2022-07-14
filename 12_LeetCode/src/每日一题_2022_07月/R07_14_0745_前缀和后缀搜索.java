package 每日一题_2022_07月;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/14 21:50
 * @Description:
 */

public class R07_14_0745_前缀和后缀搜索 {
    class WordFilter {

        Map<String, Integer> dictionary;

        public WordFilter(String[] words) {
            dictionary = new HashMap<String, Integer>();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int m = word.length();
                for (int prefixLength = 1; prefixLength <= m; prefixLength++) {
                    for (int suffixLength = 1; suffixLength <= m; suffixLength++) {
                        dictionary.put(word.substring(0, prefixLength) + "#" + word.substring(m - suffixLength), i);
                    }
                }
            }
        }

        public int f(String pref, String suff) {
            return dictionary.getOrDefault(pref + "#" + suff, -1);
        }
    }

}
