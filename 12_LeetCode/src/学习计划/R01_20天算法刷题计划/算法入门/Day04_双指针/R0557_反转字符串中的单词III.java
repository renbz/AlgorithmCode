package 学习计划.R01_20天算法刷题计划.算法入门.Day04_双指针;

/**
 * @author Ren
 */

public class R0557_反转字符串中的单词III {

    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}
