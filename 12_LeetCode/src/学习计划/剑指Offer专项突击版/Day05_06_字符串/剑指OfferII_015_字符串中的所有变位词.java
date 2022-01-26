package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 17:39
 * @Description:
 */

public class 剑指OfferII_015_字符串中的所有变位词 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int len1 = s.length(), len2 = p.length();
        if (len1 < len2) return ans;
        int[] match = new int[26], windows = new int[26];
        for (int i = 0; i < len2; i++) {
            match[p.charAt(i) - 'a']++;
            windows[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(match, windows)) ans.add(0);

        for (int i = len2; i < len1; i++) {
            windows[s.charAt(i) - 'a']++;
            windows[s.charAt(i - len2) - 'a']--;
            if (Arrays.equals(match, windows)) ans.add(i-len2+1);
        }
        return ans;
    }

}
