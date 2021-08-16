package 学习计划.数据结构基础.Day09_字符串;

import java.util.*;

/**
 * @author Ren
 */

public class R0187_重复的DNA序列 {
    public static void main(String[] args) {
        List<String> res = findRepeatedDnaSequences("AAAAAAAAAAA");
        System.out.println(res);
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            map.put(s.substring(i, i + 10), map.getOrDefault(s.substring(i, i + 10), 0) + 1);
        }

        List<String> list = new ArrayList<>();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            if (map.get(key) >= 2) list.add(key);
        }
        return list;
    }

}
