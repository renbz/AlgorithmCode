package 学习计划.剑指Offer专项突击版.Day10_11_哈希表;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/29 21:05
 * @Description:
 */

public class 剑指OfferII_031_最近最少使用缓存 {

    class LRUCache {

        Map<Integer, Integer> cache;

        public LRUCache(int capacity) {
            cache = new LinkedHashMap<Integer, Integer>(capacity + 1,0.75F,true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry var) {
                    return size() > capacity;
                }
            };
        }

        public int get(int key) {
            return this.cache.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            this.cache.put(key, value);
        }
    }
}
