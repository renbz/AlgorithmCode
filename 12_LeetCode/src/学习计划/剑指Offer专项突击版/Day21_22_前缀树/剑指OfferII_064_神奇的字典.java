package 学习计划.剑指Offer专项突击版.Day21_22_前缀树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/14 00:30
 * @Description:
 */

public class 剑指OfferII_064_神奇的字典 {

    class MagicDictionary {

        Map<Integer, ArrayList<String>> buckets;

        /**
         * Initialize your data structure here.
         */
        public MagicDictionary() {
            buckets = new HashMap<>();
        }

        public void buildDict(String[] dictionary) {
            for (String s : dictionary) {
                buckets.computeIfAbsent(s.length(), x -> new ArrayList<>()).add(s);
            }
        }

        public boolean search(String word) {
            if (!buckets.containsKey(word.length())) return false;

            for (String s : buckets.get(word.length())) {
                int mismatch = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != s.charAt(i)) {
                        if (++mismatch > 1) break;
                    }
                }
                if (mismatch == 1) return true;
            }
            return false;
        }
    }

}
