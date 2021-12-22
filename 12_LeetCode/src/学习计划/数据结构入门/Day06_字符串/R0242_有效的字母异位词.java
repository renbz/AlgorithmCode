package 学习计划.数据结构入门.Day06_字符串;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 11:32
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
