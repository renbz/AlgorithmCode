package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 17:44
 * @Description:
 */

public class 剑指OfferII_016_不含重复字符的最长子字符串 {

    public int lengthOfLongestSubstring(String s) {
        //滑动窗口
        int l = 0, r = 0, max = 0, len = s.length();
        Set<Character> set = new HashSet<>();
        while (r < len) {
            if (set.add(s.charAt(r))) {
                r++;
            } else {
                while (s.charAt(l) != s.charAt(r) && l < r) {
                    set.remove(s.charAt(l));
                    l++;
                }
                l++;
                r++;
            }
            max = Math.max(max, r - l);

        }
        return max;
    }

}
