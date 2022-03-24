package 学习计划.数据结构.数据结构入门.Day06_字符串;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 11:31
 * @Description:
 */

public class R0383_赎金信 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> RanMap = new HashMap<>();
        Map<Character, Integer> MagMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++)
            RanMap.put(ransomNote.charAt(i), RanMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        for (int i = 0; i < magazine.length(); i++)
            MagMap.put(magazine.charAt(i), MagMap.getOrDefault(magazine.charAt(i), 0) + 1);
        Set<Map.Entry<Character, Integer>> entries = RanMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value > MagMap.getOrDefault(key, 0))
                return false;
        }
        return true;
    }

}
