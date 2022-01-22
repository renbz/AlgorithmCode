package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/22 13:23
 * @Description:
 */

public class R01_22_1332_删除回文子序列 {

    public int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) return 2;
        }
        return 1;
    }

}
