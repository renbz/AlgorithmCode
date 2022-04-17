package 每日一题_2022_04月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/17 19:24
 * @Description:
 */

public class R04_17_0819_最常见的单词 {

    public String mostCommonWord(String s, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String b : banned) set.add(b);
        char[] cs = s.toCharArray();
        int n = cs.length;
        String ans = null;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ) {
            if (!Character.isLetter(cs[i]) && ++i >= 0) continue;
            int j = i;
            while (j < n && Character.isLetter(cs[j])) j++;
            String sub = s.substring(i, j).toLowerCase();
            i = j + 1;
            if (set.contains(sub)) continue;
            map.put(sub, map.getOrDefault(sub, 0) + 1);
            if (ans == null || map.get(sub) > map.get(ans)) ans = sub;
        }
        return ans;
    }

}
