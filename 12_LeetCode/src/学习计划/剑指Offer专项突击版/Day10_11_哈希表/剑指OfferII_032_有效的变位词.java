package 学习计划.剑指Offer专项突击版.Day10_11_哈希表;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/29 20:46
 * @Description:
 */

public class 剑指OfferII_032_有效的变位词 {

    public boolean isAnagram(String s, String t) {
        int m = s.length(), n = t.length();
        if(m != n) return false;
        if(s.equals(t)) return false;//这里有个特殊样例，相等判断为非变位词
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(char c : s.toCharArray()) cnt1[c - 'a']++;
        for(char c : t.toCharArray()) cnt2[c - 'a']++;
        return Arrays.equals(cnt1, cnt2);
    }

}
