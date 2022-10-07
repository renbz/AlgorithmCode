package 每日一题_2022_09月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/7 19:49
 * @Description:
 */

public class R09_29_面试题_01_09_字符串轮转 {

    public boolean isFlipedString(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m != n) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s1.charAt((i + j) % n) != s2.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

}
