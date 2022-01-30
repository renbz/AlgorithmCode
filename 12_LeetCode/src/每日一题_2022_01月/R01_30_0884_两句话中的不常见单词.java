package 每日一题_2022_01月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 17:39
 * @Description:
 */

public class R01_30_0884_两句话中的不常见单词 {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : ss1) map.put(s, map.getOrDefault(s, 0) + 1);
        for (String s : ss2) map.put(s, map.getOrDefault(s, 0) + 1);
        for (String s : map.keySet()) {
            if (map.get(s) == 1) ans.add(s);
        }
        return ans.toArray(new String[0]);
    }

}
