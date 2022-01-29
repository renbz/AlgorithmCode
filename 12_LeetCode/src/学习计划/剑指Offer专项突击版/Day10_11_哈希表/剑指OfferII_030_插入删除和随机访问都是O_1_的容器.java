package 学习计划.剑指Offer专项突击版.Day10_11_哈希表;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/29 19:06
 * @Description:
 */

public class 剑指OfferII_030_插入删除和随机访问都是O_1_的容器 {

    class RandomizedSet {

        Map<Integer, Integer> map;
        List<Integer> list;
        Random random;

        /**
         * Initialize your data structure here.
         */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain the specified element.
         */
        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified element.
         */
        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            Integer index = map.get(val);
            Integer lastEle = list.get(list.size() - 1);
            list.set(index, lastEle);
            map.put(lastEle, index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        /**
         * Get a random element from the set.
         */
        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }

}
