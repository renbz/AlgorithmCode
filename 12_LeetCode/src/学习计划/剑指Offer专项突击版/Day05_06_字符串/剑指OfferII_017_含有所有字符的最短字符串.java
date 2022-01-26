package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 18:59
 * @Description:
 */

public class 剑指OfferII_017_含有所有字符的最短字符串 {

    public String minWindow(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        String ans = "";
        if (len1 < len2) return ans;
        int[] match = new int[60], windows = new int[60];
        for (int i = 0; i < len2; i++) {
            match[t.charAt(i) - 'A']++;
        }

        int l = 0, r = 0, cnt = 0;
        while (r < len1) {
            windows[s.charAt(r) - 'A']++;
            if (windows[s.charAt(r) - 'A'] <= match[s.charAt(r) - 'A']) cnt++;
            //左边界右移
            while (windows[s.charAt(l) - 'A'] > match[s.charAt(l) - 'A'] && l < r) {
                windows[s.charAt(l) - 'A']--;
                l++;
            }
            if (cnt == t.length()) {
                if (ans.length() == 0 || r - l + 1 < ans.length()) ans = s.substring(l, r + 1);
            }
            r++;
        }
        return ans;
    }

}
