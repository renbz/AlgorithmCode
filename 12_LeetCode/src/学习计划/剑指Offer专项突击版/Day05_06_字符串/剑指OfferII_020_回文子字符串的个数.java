package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 20:41
 * @Description:
 */

public class 剑指OfferII_020_回文子字符串的个数 {

    public int countSubstrings(String s) {
        // 中心扩展法
        int len = s.length(), ans = 0;
        for (int i = 0; i < 2 * len - 1; i++) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                l--; r++; ans++;
            }
        }
        return ans;
    }

}
