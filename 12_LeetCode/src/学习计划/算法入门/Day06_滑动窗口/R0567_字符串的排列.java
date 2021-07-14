package 学习计划.算法入门.Day06_滑动窗口;

/**
 * @author Ren
 */

public class R0567_字符串的排列 {

    public static void main(String[] args) {
        R0567_字符串的排列 obj = new R0567_字符串的排列();
        System.out.println(obj.checkInclusion("ab", "a"));

    }

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length(), l = 0, r = len1 - 1;
        if (len1 <= 0 || len1 > len2) return false;
        int[] arr = new int[26];
        for (int i = 0; i < len1; i++) arr[s1.charAt(i) - 'a']--;

        for (int i = l; i <= r; i++) arr[s2.charAt(i) - 'a']++;
        while (r < len2) {
            if (isAllUpZero(arr)) return true;
            arr[s2.charAt(l++) - 'a']--;
            if (++r < len2) arr[s2.charAt(r) - 'a']++;
        }
        return false;
    }

    public boolean isAllUpZero(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) return false;
        return true;
    }
}
