package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 17:22
 * @Description:
 */

public class 剑指OfferII_014_字符串中的变位词 {

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        int[] match = new int[26], windows = new int[26];
        for (int i = 0; i < len1; i++) {
            match[s1.charAt(i) - 'a']++;
            windows[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(match, windows)) return true;

        for (int i = len1; i < len2; i++) {
            windows[s2.charAt(i) - 'a']++;
            windows[s2.charAt(i - len1) - 'a']--;
            if (Arrays.equals(match, windows)) return true;
        }
        return false;
    }

}
