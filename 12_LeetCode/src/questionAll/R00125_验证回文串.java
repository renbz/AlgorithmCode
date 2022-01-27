package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/26 14:31
 * @Description:
 */

public class R00125_验证回文串 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W|[_]", "").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
