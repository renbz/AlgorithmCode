package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/13 14:48
 * @Description:
 */

public class R05_13_面试题_01_05_一次编辑 {

    public boolean oneEditAway(String first, String second) {
        if (first.equals(second)) return true;
        int f_len = first.length(), s_len = second.length();
        //如果f_len = s_len 替换
        if (f_len == s_len) {
            int count = 0;
            for (int i = 0; i < f_len; i++) {
                if (first.charAt(i) == second.charAt(i)) {
                    continue;
                }
                count++;
            }
            return count < 2;
        }
        // 长度差距 大于等于2 返回false
        if (Math.abs(f_len - s_len) > 1) return false;
        // 插入 = 删除
        String small, big;
        if (s_len < f_len) {
            small = second;
            big = first;
        } else {
            small = first;
            big = second;
        }
        // 双指针
        int len1 = Math.min(f_len, s_len), len2 = Math.max(f_len, s_len);
        int a = 0, b = 0;
        while (a < len1 && b < len2) {
            if (small.charAt(a) == big.charAt(b)) {
                a++;
                b++;
            } else {
                b++;
            }
        }
        return a == len1;

    }

}
