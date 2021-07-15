package 学习计划.数据结构基础.Day07_字符串;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R0290_单词规律 {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> patternMap = new HashMap<>();
        Map<String, Integer> strMap = new HashMap<>();

        String[] strArr = s.split(" ");
        if (strArr.length != pattern.length()) return false;
        for (int i = 0; i < strArr.length; i++) {
            // 如果发现重复
            if (strMap.get(strArr[i]) != null) {
                int index = strMap.get(strArr[i]);
                strMap.put(strArr[i], i);
                if (pattern.charAt(i) != pattern.charAt(index))
                    return false;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (patternMap.get(s.charAt(i)) != null) {
                int index = patternMap.get(s.charAt(i));
                patternMap.put(s.charAt(i), i);
                if (strArr[i].equals(strArr[index]))
                    return false;
            }
        }
        return true;
    }

}
