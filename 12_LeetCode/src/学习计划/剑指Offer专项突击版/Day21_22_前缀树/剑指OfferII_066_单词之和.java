package 学习计划.剑指Offer专项突击版.Day21_22_前缀树;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/20 00:28
 * @Description:
 */

public class 剑指OfferII_066_单词之和 {

    class MapSum {
        Map<String, Integer> map = null;
        Map<String, Integer> map_v = null;

        public MapSum() {
            map = new HashMap<>();
            map_v = new HashMap<>();
        }

        public void insert(String key, int val) {
            int v = 0;
            if (map_v.get(key) != null){
                v = map_v.get(key);
            }
            map_v.put(key, val);
            for (int i = 1; i <= key.length(); i++) {
                String s = key.substring(0, i);
                map.put(s, map.getOrDefault(s, 0) + val - v);
            }
        }

        public int sum(String prefix) {
            return map.getOrDefault(prefix, 0);
        }
    }

}
