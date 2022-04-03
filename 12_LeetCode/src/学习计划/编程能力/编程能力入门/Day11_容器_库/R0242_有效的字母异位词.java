package 学习计划.编程能力.编程能力入门.Day11_容器_库;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 15:33
 * @Description:
 */

public class R0242_有效的字母异位词 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        return Arrays.toString(charsS).equals(Arrays.toString(charsT));
    }

}
