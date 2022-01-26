package 学习计划.剑指Offer专项突击版.Day05_06_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 19:49
 * @Description:
 */

public class 剑指OfferII_018_有效的回文 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W|[_]", "").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
