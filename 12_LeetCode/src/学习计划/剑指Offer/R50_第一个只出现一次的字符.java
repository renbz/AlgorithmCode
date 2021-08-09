package 学习计划.剑指Offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R50_第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1) return s.charAt(i);
        }
        return ' ';
    }
}
