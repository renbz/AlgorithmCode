package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 20:23
 * @Description:
 */

public class 剑指OfferII_019_最多删除一个字符得到回文 {
    public boolean validPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; l++, r--) {
            //如果不相等,则分两种情况讨论: 删除左边的元素,或者删除右边的元素,再判断各自是否回文
            if (s.charAt(l) != s.charAt(r)) {
                return isPa(s, l + 1, r) || isPa(s, l, r - 1);
            }
        }
        return true;
    }

    // 判断字串s的[l,r] 是否回文
    private boolean isPa(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
