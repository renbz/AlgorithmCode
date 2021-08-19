package 学习计划.数据结构基础.Day20_优先队列;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R0347_前K个高频元素 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        //PriorityQueue<Map<Integer,Integer>> minHeap2 = new PriorityQueue<Map<Integer,Integer>>((o1, o2) -> map.get(o1) - map.get(o2));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if(minHeap.size()<k){
                minHeap.offer(new int[]{num,count});
            }else{
                if(minHeap.peek()[1]<count){
                    minHeap.poll();
                    minHeap.offer(new int[]{num,count});
                }
            }
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; ++i) {
            ret[i] = minHeap.poll()[0];
        }
        return ret;
    }

}
