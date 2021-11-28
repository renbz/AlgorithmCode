package 每日一题_2021_11月;

/**
 * @author Ren
 */

import java.util.*;

public class R11_28_0438_找到字符串中所有字母异位词 {

    public List<Integer> findAnagrams(String s, String p) {
        int slen = s.length(), plen = p.length();
        int[] s_cnt = new int[26];
        int[] p_cnt = new int[26];
        ArrayList<Integer> ans = new ArrayList<>();
        if (slen < plen) return ans;
        for (int i = 0; i < plen; i++) {
            s_cnt[s.charAt(i) - 'a']++;
            p_cnt[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s_cnt, p_cnt)) ans.add(0);
        for (int i = plen; i < s.length(); i++) {
            s_cnt[s.charAt(i - plen) - 'a']--;
            s_cnt[s.charAt(i) - 'a']++;
            if (Arrays.equals(s_cnt, p_cnt)) ans.add(i - plen + 1);
        }
        return ans;
    }
}
