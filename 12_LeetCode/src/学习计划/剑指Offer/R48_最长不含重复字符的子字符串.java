package 学习计划.剑指Offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class R48_最长不含重复字符的子字符串 {

    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
            while (set.contains(s.charAt(r))) set.remove(s.charAt(l++));
            set.add(s.charAt(r));
            max = max > set.size() ? max : set.size();
            r++;
        }
        return max;
    }
}
