package 学习计划.编程能力.编程能力入门.Day08_09_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/30 18:15
 * @Description:
 */

public class R1768_交替合并字符串 {

    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length(), l1 = 0, l2 = 0;
        StringBuilder ans = new StringBuilder();
        while (l1 < len1 && l2 < len2) {
            ans.append(word1.charAt(l1++)).append(word2.charAt(l2++));
        }
        while (l1 < len1) ans.append(word1.charAt(l1++));
        while (l2 < len2) ans.append(word1.charAt(l1++));
        return ans.toString();
    }

}
