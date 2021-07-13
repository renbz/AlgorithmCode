package 学习计划.R01_20天算法刷题计划.算法入门.Day04_双指针;

/**
 * @author Ren
 */

public class R0344_反转字符串 {

    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r) {
            char t = s[l];
            s[l++] = s[r];
            s[r--] = t;
        }
    }
}
