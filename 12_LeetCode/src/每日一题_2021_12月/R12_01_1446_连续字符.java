package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/30 17:54
 * @Description:
 */

public class R12_01_1446_连续字符 {

    /**
     * 双指针
     *
     * @param s
     * @return
     */
    public int maxPower(String s) {

        int l = 0, r = 0;
        int res = 0, max = 0;
        while (r < s.length()) {
            if (s.charAt(r) == s.charAt(l)) {
                max = max = max > r - l + 1 ? max : r - l + 1;
            } else {
                max = max > r - l ? max : r - l;
                l = r;
            }
            r++;
        }
        return max;
    }

}
