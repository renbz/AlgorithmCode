package 学习计划.高效制胜.Day08_字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 20:57
 * @Description:
 */

public class R0003_无重复字符的最长子串 {

    public int lengthOfLongestSubstring(String s) {
        //双指针
        int l = 0, r = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
            while (set.contains(s.charAt(r))) set.remove(s.charAt(l++));
            set.add(s.charAt(r++));
            max = Math.max(max, set.size());
        }
        return max;
    }

}
