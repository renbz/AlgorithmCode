package 每日一题_2021_7月;

import java.util.*;

/**
 * @author Ren
 */

public class R07_03_0452_根据字符出现频率排序 {



    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        //将字符和频率存入hashmap中
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

        // 优先级队列排序  - 重写排序方法  将其变成大根堆
        // 若频率相同  则按字符的字典序排序
        PriorityQueue<Node> maxHeap = new PriorityQueue<>((o1, o2) -> o2.f - o1.f == 0 ? o2.c - o1.c : o2.f - o1.f);
        /* 遍历map的entry集合  放入Node中  再放入大根堆  */
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            maxHeap.add(node);
        }

        StringBuilder builder = new StringBuilder();
        while (!maxHeap.isEmpty()) {  // 当大根堆不为空时
            Node node = maxHeap.poll();
            char c = node.c;
            int f = node.f;
            for (int i = 0; i < f; i++) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    class Node {
        char c;
        int f;

        public Node(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }


}
