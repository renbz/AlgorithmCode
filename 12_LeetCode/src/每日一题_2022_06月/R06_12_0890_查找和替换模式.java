package 每日一题_2022_06月;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/12 22:27
 * @Description:
 */

public class R06_12_0890_查找和替换模式 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (mach(word, pattern) && mach(pattern, word)) {
                ans.add(word);
            }
        }
        return ans;
    }

    private boolean mach(String word, String pattern) {
        if (word.length() != pattern.length()) return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i), y = pattern.charAt(i);
            if (!map.containsKey(x)) {
                map.put(x, y);
            } else if (map.get(x) != y) {
                return false;
            }
        }
        return true;
    }

}
