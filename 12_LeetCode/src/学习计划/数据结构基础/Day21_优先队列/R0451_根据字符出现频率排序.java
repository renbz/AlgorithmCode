package 学习计划.数据结构基础.Day21_优先队列;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R0451_根据字符出现频率排序 {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder(s.length());
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (o1, o2) -> o1.getValue() - o2.getValue() == 0 ? o2.getKey() - o1.getKey() : o2.getValue() - o1.getValue());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) maxHeap.add(entry);
        StringBuilder builder = new StringBuilder();
        while (!maxHeap.isEmpty()) {  // 当大根堆不为空时
            Map.Entry entry = maxHeap.poll();
            char key = (char) entry.getKey();
            int value = (int) entry.getValue();
            for (int i = 0; i < value; i++) ans.append(key);
        }
        return ans.toString();
    }

}
