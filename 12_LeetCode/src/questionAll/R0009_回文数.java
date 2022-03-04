package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/2 21:35
 * @Description:
 */

public class R0009_回文数 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        if (x % 10 == 0) return false;
        return new StringBuilder(x + "").reverse().toString().equals(x + "");
    }

}
