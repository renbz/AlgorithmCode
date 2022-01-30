package 学习计划.剑指Offer专项突击版.Day10_11_哈希表;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 18:37
 * @Description:
 */

public class 剑指OfferII_033_变位词组 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            ArrayList<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

}
