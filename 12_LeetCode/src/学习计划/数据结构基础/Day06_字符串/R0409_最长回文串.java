package 学习计划.数据结构基础.Day06_字符串;

/**
 * @author Ren
 */

public class R0409_最长回文串 {
    public int longestPalindrome(String s) {
        int[] ch = new int[58];
        for (int i = 0; i < s.length(); i++) ch[s.charAt(i) - 'A']++;
        int count = 0;
        for (int i = 0; i < ch.length; i++) count += ch[i] % 2;
        return count == 0 ? s.length() : s.length() - count + 1;
    }
}
