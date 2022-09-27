package 每日一题_2022_09月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/27 23:59
 * @Description:
 */

public class R09_27_面试题_01_02_判定是否互为字符重排 {

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

}
